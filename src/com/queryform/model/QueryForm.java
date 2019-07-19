/**
 * 
 */
package com.queryform.model;

import java.io.Serializable;

/**
 * @author KVB3112
 *
 */
public class QueryForm implements Serializable {

	/**
	 * serialVersionUID value;
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String emailId;
	private String contactNumber;
	private String currentProfession;
	private String reasonOfInterest;
	private String whyFranchise;
	private String haveYouExperienced;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the currentProfession
	 */
	public String getCurrentProfession() {
		return currentProfession;
	}

	/**
	 * @param currentProfession the currentProfession to set
	 */
	public void setCurrentProfession(String currentProfession) {
		this.currentProfession = currentProfession;
	}

	/**
	 * @return the reasonOfInterest
	 */
	public String getReasonOfInterest() {
		return reasonOfInterest;
	}

	/**
	 * @param reasonOfInterest the reasonOfInterest to set
	 */
	public void setReasonOfInterest(String reasonOfInterest) {
		this.reasonOfInterest = reasonOfInterest;
	}

	/**
	 * @return the whyFranchise
	 */
	public String getWhyFranchise() {
		return whyFranchise;
	}

	/**
	 * @param whyFranchise the whyFranchise to set
	 */
	public void setWhyFranchise(String whyFranchise) {
		this.whyFranchise = whyFranchise;
	}

	/**
	 * @return the haveYouExperienced
	 */
	public String getHaveYouExperienced() {
		return haveYouExperienced;
	}

	/**
	 * @param haveYouExperienced the haveYouExperienced to set
	 */
	public void setHaveYouExperienced(String haveYouExperienced) {
		this.haveYouExperienced = haveYouExperienced;
	}

}
