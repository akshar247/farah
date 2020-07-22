package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class SocialLoginResponse {
    @SerializedName("email")
    public String email;
    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public DataEntity data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("profilestatus")
        public int profilestatus;
        @SerializedName("id")
        public int id;
    }
}