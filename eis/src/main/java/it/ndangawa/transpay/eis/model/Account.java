/**
 * Copyright (c) 2022 ndangawa.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawa.it/opensources/transpay/LICENSE.txt
 */


package it.ndangawa.transpay.eis.model;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Calendar;


/**
 * @author Ndanga Wandji
 *
 */
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6728978388487408822L;
	
	private int accountID;
	
	private String electronicMail;
	
	private String password;

	private String role;
	
	private Customer customer;

	/**
	 * 
	 */
	public Account() {

	}

	/**
	 * @param accountID
	 * @param electronicMail
	 * @param password
	 * @param role
	 */
	public Account(int accountID, String electronicMail, String password, String role) {
		super();
		this.accountID = accountID;
		this.electronicMail = electronicMail;
		this.password = password;
		this.role = role;
	}

	/**
	 * @param electronicMail
	 * @param password
	 * @param role
	 */
	public Account(String electronicMail, String password, String role) {
		super();
		this.electronicMail = electronicMail;
		this.password = password;
		this.role = role;
	}

	/**
	 * @param electronicMail
	 * @param password
	 */
	public Account(String electronicMail, String password) {
		super();
		this.electronicMail = electronicMail;
		this.password = password;
	}
	
	/**
	 * @param accountID
	 * @param electronicMail
	 * @param password
	 * @param role
	 * @param customer
	 */
	public Account(int accountID, String electronicMail, String password, String role, Customer customer) {
		super();
		this.accountID = accountID;
		this.electronicMail = electronicMail;
		this.password = password;
		this.role = role;
		this.customer = customer;
	}

	public Customer initializeInfos(String firstName, String lastName, FileInputStream picture, Calendar birthdate,
			String sex, String mobilePhone) {
		
		return new Customer(firstName, lastName, picture, birthdate, sex, mobilePhone);
	}

	/**
	 * @return the accountID
	 */
	public int getAccountID() {
		return this.accountID;
	}

	/**
	 * @param accountID the accountID to set
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the eMail
	 */
	public String getElectronicMail() {
		return electronicMail;
	}

	/**
	 * @param eMail the eMail to set
	 */
	public void setElectronicMail(String eMail) {
		this.electronicMail = eMail;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the password to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * @return the customer
	 */
	public Customer getAccountInfos() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setAccountInfos(Customer customer) {
		this.customer = customer;
	}


}


