package com.wwjportal.Model.Portal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

/**
 * Created by User on 12/04/2016.
 */

@Entity
public class Role_Permission {


    @Id
    @GeneratedValue
    private int role_permission_id;

    private Role role_id;

    private Permission permission;

    public int getRole_permission_id() {
        return role_permission_id;
    }

    public void setRole_permission_id(int role_permission_id) {
        this.role_permission_id = role_permission_id;
    }

    public Role getRole_id() {
        return role_id;
    }

    public void setRole_id(Role role_id) {
        this.role_id = role_id;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
