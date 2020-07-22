package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class UserStatusResponse {
    @SerializedName("status")
    public String status;
    @SerializedName("error")
    public String error;
    @SerializedName("result")
    public String result;
}