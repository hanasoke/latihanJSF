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
@Named(value = "login")

@ManagedBean(name = "login2", eager = true)
@RequestScoped

public class login {

    public String username, password, message;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
            
    public String login() {
        if(username.equals("admin")&&password.equals("admin"))
        {
            message = "Login Success As";
            return "success";
        }
        else 
        {
            message = "Login Failed";
            return "index";
        }
    }
    
}
