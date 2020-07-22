package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class LastLoginResponse {

    @SerializedName("error")
    public String error;

    @SerializedName("data")
    public DataEntity data;

    @SerializedName("result")
    public String result;

    public static class DataEntity {

        @SerializedName("is_loggedin")
        public boolean is_loggedin;

        @SerializedName("is_validated")
        public boolean is_validated;

        @SerializedName("login_time")
        public String login_time;

        @SerializedName("createddate")
        public String createddate;

        @SerializedName("status")
        public String status;

        @SerializedName("otpstatus")
        public String otpstatus;

        @SerializedName("image")
        public String image;

        @SerializedName("mobileno")
        public String mobileno;

        @SerializedName("password")
        public String password;

        @SerializedName("email")
        public String email;

        @SerializedName("lastname")
        public String lastname;

        @SerializedName("device_udid")
        public String device_udid;

        @SerializedName("firstname")
        public String firstname;

        @SerializedName("id")
        public String id;
    }
}