package com.wwjportal.Model.AlarmDB;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by User on 11/04/2016.
 */
@Entity
public class UserDetail {


    @Id
    @Column(name = "UserKey")
    private int userKey;

    @Column(name = "UserName")
    private String Username;

    @Column(name = "AccessLevel")
    private int accesslevel;

    @Column(name = "uid")
    private int uid;

    @Column(name = "gid")
    private int gid;

    public int getUserKey() {
        return userKey;
    }

    public void setUserKey(int userKey) {
        this.userKey = userKey;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getAccesslevel() {
        return accesslevel;
    }

    public void setAccesslevel(int accesslevel) {
        this.accesslevel = accesslevel;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }
}