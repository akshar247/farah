package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class PostAdResponse {
    @SerializedName("status")
    public boolean status;
    @SerializedName("error")
    public String error;
    @SerializedName("result")
    public String result;
}