package com.queryform.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.queryform.dao.QueryFormDAO;
import com.queryform.model.QueryForm;

/**
 * 
 */

/**
 * @author KVBhaskar
 *
 */
public class QueryFormServlet extends HttpServlet {

	/**
	 * serialVersionUID value;
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
	@Override
	public void doGet(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
			throws ServletException, IOException {

		httpResponse.setContentType("text/html");
		PrintWriter out = httpResponse.getWriter();
		QueryForm queryForm = new QueryForm();
		try {
			queryForm.setFirstName(httpRequest.getParameter("firsName"));
			queryForm.setLastName(httpRequest.getParameter("lastName"));
			queryForm.setEmailId(httpRequest.getParameter("emailId"));
			queryForm.setContactNumber(httpRequest.getParameter("contactNumber"));
			queryForm.setCurrentProfession(httpRequest.getParameter("currentProfession"));
			queryForm.setReasonOfInterest(httpRequest.getParameter("reasonOfInterest"));
			queryForm.setWhyFranchise(httpRequest.getParameter("whyFranchise"));
			queryForm.setHaveYouExperienced(httpRequest.getParameter("haveYouExperienced"));

			String action = httpRequest.getServletPath();
			QueryFormDAO queryFormDAO = new QueryFormDAO();

			switch (action) {
			case "/query_form":
				int count = queryFormDAO.insertQueryForm(queryForm);
				break;
			case "/getEnquiryData":
				List<QueryForm> listOfForms = queryFormDAO.fetchQueryForm(queryForm);
				break;
			case "/updateEnquiryData":
				int updatedCount = queryFormDAO.updateQueryForm(queryForm);
				break;
			default:
				String result = "Not Valid Form Data";
				break;
			}

			RequestDispatcher dispatcher = httpRequest.getRequestDispatcher("querystatus.jsp");
			dispatcher.forward(httpRequest, httpResponse);

		} catch (Exception ex) {
			System.out.println("Exception Occred at QueryFormServlet : " + ex.getMessage());
		} finally {
			out.close();
		}
	}
}
