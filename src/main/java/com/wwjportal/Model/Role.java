package com.wwjportal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by User on 11/04/2016.
 */

@Entity
public class Role {

    @Id
    @GeneratedValue
    private int role_id;

    @Column(name="role_name")
    private String role_name;

    @Column(name="role_operator")
    private String role_operator;

    @Column(name="role_status")
    private String role_status;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_operator() {
        return role_operator;
    }

    public void setRole_operator(String role_operator) {
        this.role_operator = role_operator;
    }

    public String getRole_status() {
        return role_status;
    }

    public void setRole_status(String role_status) {
        this.role_status = role_status;
    }
}
