package com.farah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public  class LoginResponse {


    @Expose
    @SerializedName("message")
    public String message;
    @Expose
    @SerializedName("data")
    public DataEntity data;
    @Expose
    @SerializedName("success")
    public int success;

    public static class DataEntity {
        @Expose
        @SerializedName("comission")
        public String comission;
        @Expose
        @SerializedName("bank_routing_number")
        public String bankRoutingNumber;
        @Expose
        @SerializedName("bank_account_name")
        public String bankAccountName;
        @Expose
        @SerializedName("bank_account_number")
        public String bankAccountNumber;
        @Expose
        @SerializedName("bank_name")
        public String bankName;
        @Expose
        @SerializedName("website")
        public String website;
        @Expose
        @SerializedName("address")
        public String address;
        @Expose
        @SerializedName("user_type")
        public int userType;
        @Expose
        @SerializedName("role_id")
        public int roleId;
        @Expose
        @SerializedName("profile_image")
        public String profileImage;
        @Expose
        @SerializedName("email")
        public String email;
        @Expose
        @SerializedName("mobile_no")
        public String mobileNo;
        @Expose
        @SerializedName("lastname")
        public String lastname;
        @Expose
        @SerializedName("firstname")
        public String firstname;
        @Expose
        @SerializedName("id")
        public int id;
    }
}