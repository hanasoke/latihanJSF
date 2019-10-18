/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.jsf.hello;

import javax.inject.Named;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.mail.Message;

/**
 *
 * @author hanas_bp
 */
@Named(value = "student")

@ManagedBean(name = "student2", eager = true)
@RequestScoped

public class student {
    
    private String firstName;
    private String lastName;
    
//    create no-arg constructor
    public student() {
        
    }
    
//    define getter and setter methods

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
    
    
}
