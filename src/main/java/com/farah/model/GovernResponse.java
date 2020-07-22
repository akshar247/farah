package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GovernResponse {
    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("arabic")
        public String arabic;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }
}