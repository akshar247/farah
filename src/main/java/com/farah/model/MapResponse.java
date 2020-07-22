package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MapResponse {

    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("longitude")
        public String longitude;
        @SerializedName("latitude")
        public String latitude;
        @SerializedName("id")
        public String id;
    }
}