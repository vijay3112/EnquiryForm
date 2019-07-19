/**
 * 
 */
package com.queryform.interfaces;

import java.util.List;

import com.queryform.model.QueryForm;

/**
 * @author KVBhaskar
 *
 */
public interface QueryFormInterface {

	// Submit query form
	public int insertQueryForm(QueryForm queryForm) throws ClassNotFoundException;

	public int updateQueryForm(QueryForm queryForm);

	public List<QueryForm> fetchQueryForm(QueryForm queryForm);
}
