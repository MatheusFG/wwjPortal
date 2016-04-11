package com.wwjportal.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by User on 11/04/2016.
 */
@Entity

public class Permission {

    @Id
    private int permission_id;

    @Column(name="permission_name")
    private String permission_name;

    @Column(name="permission_status")
    private String permission_status;

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    public String getPermission_status() {
        return permission_status;
    }

    public void setPermission_status(String permission_status) {
        this.permission_status = permission_status;
    }
}
