package com.srtsite.sarathpscom.models;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity(name = "users")
public class Users {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="email_id")
    private String emailId;
    @Column(name="phone_number")
    private String phoneNumber;


   // private List<Users> usersList;

    public Users() {
    }

   // public List<Users> getUsersList() {
     //   return usersList;
    //}

    //public void setUsersList(List<Users> usersList) {
      //  this.usersList = usersList;
    //}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
