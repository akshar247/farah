package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CheckExistResponse {

    @SerializedName("error")
    public String error;

    @SerializedName("data")
    public List<String> data;

    @SerializedName("result")
    public String result;
}