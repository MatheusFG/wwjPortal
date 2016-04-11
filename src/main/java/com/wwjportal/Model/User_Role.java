package com.wwjportal.Model;

import javax.persistence.*;

/**
 * Created by User on 12/04/2016.
 */

@Entity
public class User_Role {


    @Id
    @GeneratedValue
    private int user_role_id;


    @ManyToMany
    @JoinColumn(foreignKey=@ForeignKey(foreignKeyDefinition="FOREIGN KEY (USER_ID) REFERENCES USER"))
    private User user;

    @ManyToMany
    @JoinColumn(foreignKey = @ForeignKey(foreignKeyDefinition = "FOREIGN KEY(ROLE_ID) REFERENCES ROLE"))
    private Role role;


    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
