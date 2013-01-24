/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.micropole.esss;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JLANDREI
 */
@ManagedBean
@SessionScoped
public class LoginBean {
    private String j_username;
    private String j_password;

    public void setJ_password(String j_password) {
        this.j_password = j_password;
    }

    public String getJ_username() {
        return j_username;
    }

    public void setJ_username(String j_username) {
        this.j_username = j_username;
    }
    
    
    
}
