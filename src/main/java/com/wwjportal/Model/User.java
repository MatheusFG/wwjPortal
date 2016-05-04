package com.wwjportal.Model;

import ch.qos.logback.classic.db.names.ColumnName;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GenerationType;
/**
 * Created by User on 11/04/2016.
 */
@Entity
@Table(name="User")
public class User{


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int user_id;

    @Column(name = "user_login", unique = true)
    private String user_login;

    @Column(name = "user_password")
    private String user_password;

    @Column(name = "user_email")
    private String user_email;

    @Column(name = "user_dataCreation")
    private String user_creation;

    @Column(name = "user_status")
    private String user_status;

    @ManyToMany
    private Collection<Role> roleList = new ArrayList<Role>();

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_senha) {
        this.user_password = user_senha;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_creation() {
        return user_creation;
    }

    public void setUser_creation(String user_creation) {
        this.user_creation = user_creation;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }


    public Collection<Role> getUserList() {
        return roleList;
    }

    public void setUserList(Collection<Role> userList) {
        this.roleList = userList;
    }
}
