package edu.ucar.unidata.wmotables.domain;

import java.util.Date;
import java.util.List;
import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Object representing a User.  
 *
 * A User is person with an account in the wmotables web app. 
 * The User attributes correspond to database columns.
 */

public class User implements Serializable {

    private int userId;
    @NotEmpty 
    @Size(min = 6, max = 50)
    private String userName;
    private String password;
    private int accessLevel;
    @NotEmpty 
    @Email
    private String emailAddress;
    @NotEmpty 
    @Size(min = 8, max = 100)
    private String fullName;
    @NotEmpty 
    @Size(min = 3, max = 100)
    private String affiliation;
    private Date dateCreated;
    private Date dateModified;

    /**
     * Returns the id of the user in the database (immutable/unique to each user).
     * 
     * @return  The user id. 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the id of the user in the database (immutable/unique to each user).
     * 
     * @param userId  The user id. 
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Returns the user name of the user (immutable/unique to each user).
     * 
     * @return  The user's user name.  
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name of the user (immutable/unique to each user).
     * 
     * @param userName  The user's user name. 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the user's password.
     * 
     * @return  The user's password.  
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the user's password.
     * 
     * @param password  The user's password. 
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the access level of the user.
     * 
     * @return  The user's access level. 
     */
    public int getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the access level of the user.
     * 
     * @param accessLevel  The user's access level. 
     */
    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    /**
     * Returns the email address of the user (mutable/unique to each user).
     * 
     * @return  The user's email address.  
     */ 
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the email address of the user (mutable/unique to each user).
     * 
     * @param emailAddress  The user's email address. 
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Returns the full name of the user.
     * 
     * @return  The user's full name.  
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the user.
     * 
     * @param fullName  The user's full name. 
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns the affiliation of the user.
     * 
     * @return  The user's affiliation.  
     */
    public String getAffiliation() {
        return affiliation;
    }

    /**
     * Sets the affiliation of the user.
     * 
     * @param affiliation  The user's affiliation. 
     */
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    /**
     * Returns date the user was created.
     * 
     * @return  The user's creation date.
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * Sets the date the user was created.
     * 
     * @param dateCreated   The user's creation date.
     */    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Returns date the user's account was last modified.
     * 
     * @return  The user account last modified date.
     */
    public Date getDateModified() {
        return dateModified;
    }
    
    /**
     * Sets the date the user's account was last modified.
     * 
     * @param dateModified   The user account last modified date.
     */    
    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }
}
