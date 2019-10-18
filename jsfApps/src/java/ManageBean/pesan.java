/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBean;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.mail.Message;

/**
 *
 * @author hanas_bp
 */
@Named(value = "pesan")

@ManagedBean(name = "pesan2", eager = true)
@RequestScoped
        
public class pesan {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String message;
    
//    create no-arg construct
    public pesan() {
        
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
}
