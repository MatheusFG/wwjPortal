package com.wwjportal.Model.Portal;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by User on 11/04/2016.
 */

@Entity
public class Role{

    @Id
    private int role_id;

    @Column(name="role_name")
    private String role_name;

    @Column(name="role_operator")
    private String role_operator;

    @Column(name="role_status")
    private String role_status;


    @ManyToMany(mappedBy = "roleList")
    private Collection<User> userList = new ArrayList<User>();
/*    @ManyToMany
    @JoinTable(name="User_Role",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name="user_id")})
    private Set<Role> listrole = new HashSet<Role>();*/

    public Collection<User> getUserList() {
        return userList;
    }

    public void setUserList(Collection<User> userList) {
        this.userList = userList;
    }

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
