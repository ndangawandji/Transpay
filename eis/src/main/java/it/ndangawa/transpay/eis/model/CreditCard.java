/**
 * Copyright (c) 2022 ndangawa.it. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * https://www.ndangawa.it/opensources/transpay/LICENSE.txt
 */

 
package it.ndangawa.transpay.eis.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Ndanga Wandji
 *
 */
public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7624015660724755153L;
	
	private int CreditCardID;
	
	private String number;
	
	private int crypto;
	
	private Calendar validityDate;
	
	private String owner;

	private Account account;

	/**
	 * 
	 */
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public CreditCard(String CreditCardNumber, int creditCardCrypto, Calendar date) {
		// TODO Auto-generated constructor stub
		this.number = CreditCardNumber;
		this.crypto = creditCardCrypto;
		this.validityDate = date;
	}

	/**
	 * @return the creditCardID
	 */
	public int getCreditCardID() {
		return CreditCardID;
	}

	/**
	 * @param creditCardID the creditCardID to set
	 */
	public void setCreditCardID(int creditCardID) {
		CreditCardID = creditCardID;
	}

	/**
	 * @return the credit card number
	 */
	public String getNumber() {
		return this.number;
	}

	/**
	 * @param number the credit card number to set
	 */
	public void number(String creditCardNumber) {
		this.number = creditCardNumber;
	}

	/**
	 * @return the credit card crypto
	 */
	public int getCrypto() {
		return this.crypto;
	}

	/**
	 * @param crypto the credit card crypto to set
	 */
	public void setCrypto(int creditCardCrypto) {
		this.crypto = creditCardCrypto;
	}

	/**
	 * @return the validity date
	 */
	public Calendar getValidityDate() {
		return validityDate;
	}

	/**
	 * @param validityDate the validity date to set
	 */
	public void setValidityDate(Calendar validityDate) {
		this.validityDate = validityDate;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return this.account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

}
