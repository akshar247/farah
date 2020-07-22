package com.farah.model;

import java.io.Serializable;

public class UserModelFireBase implements Serializable {
    private String status;
    private String profilePicLink;
    private String name;
    private String email;
    private String lastmessagetime;
    private String lastmessageconverstationid;
    private String ID;
    private String lastmessage;
    private String location;
    private String device_token;

    public String getLastmessagetime() {
        return lastmessagetime;
    }

    public void setLastmessagetime(String lastmessagetime) {
        this.lastmessagetime = lastmessagetime;
    }

    public String getLastmessageconverstationid() {
        return lastmessageconverstationid;
    }

    public void setLastmessageconverstationid(String lastmessageconverstationid) {
        this.lastmessageconverstationid = lastmessageconverstationid;
    }

    public UserModelFireBase() {}

    public String getDevice_token() {
        return device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }

    public UserModelFireBase(String status, String name, String email, String ID, String location, String profilePicLink, String device_token) {
        this.status = status;
        this.profilePicLink = profilePicLink;
        this.name = name;
        this.email = email;
        this.ID = ID;
        this.location = location;
        this.device_token = device_token;
    }

    public String getLastmessage() {
        return lastmessage;
    }

    public void setLastmessage(String lastmessage) {
        this.lastmessage = lastmessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilePicLink() {
        return profilePicLink;
    }

    public void setProfilePicLink(String profilePicLink) {
        this.profilePicLink = profilePicLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "UserModelFireBase{" +
                "status='" + status + '\'' +
                ", profilePicLink='" + profilePicLink + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID='" + ID + '\'' +
                ", lastmessage='" + lastmessage + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}