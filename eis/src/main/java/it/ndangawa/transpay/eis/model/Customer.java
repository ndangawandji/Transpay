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

public class Customer implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5212882469102668059L;
    
    private int customerID;
    
    private String firstName;
    
    private String lastName;
    
    private FileInputStream picture;
    
    private Calendar birthdate;
    
    private String sex;
    
    private String mobilePhone;

    /**
     * 
     */
    public Customer() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param firstName
     * @param lastName
     * @param picture
     * @param birthdate
     * @param sex
     * @param mobilePhone
     */
    public Customer(String firstName, String lastName, FileInputStream picture, Calendar birthdate, String sex, String mobilePhone) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.picture = picture;
        this.birthdate = birthdate;
        this.sex = sex;
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the picture
     */
    public FileInputStream getPicture() {
        return picture;
    }

    /**
     * @param picture the picture to set
     */
    public void setPicture(FileInputStream picture) {
        this.picture = picture;
    }

    /**
     * @return the birth data
     */
    public Calendar getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birth date to set
     */
    public void setBirthdate(Calendar birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex date to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the mobile phone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobile phone date to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
}
