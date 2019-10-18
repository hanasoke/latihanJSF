/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manageBean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author JACOB
 */
@Named(value = "login")
@Dependent

@ManagedBean(name = "login1", eager = true)
@RequestScoped

public class login {

    public String username, password, massage;

    public String login() {
        if (username.equals("admin") && password.equals("admin") || username.equals("user") && password.equals("user")) {
            massage = "Succes Login";
            return "success";
        } else {
            massage = "login Failed";
            return "index";
        }
    }

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

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    /**
     * Creates a new instance of login
     */
}
