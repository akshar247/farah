package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BestRentalResponse {

    @SerializedName("error")
    public String error;

    @SerializedName("data")
    public List<DataEntity> data;

    @SerializedName("result")
    public String result;

    public static class DataEntity {

        @SerializedName("filetype")
        public String filetype;

        @SerializedName("file")
        public String file;

        @SerializedName("ownername")
        public String ownername;

        @SerializedName("price")
        public String price;

        @SerializedName("longitude")
        public String longitude;

        @SerializedName("latitude")
        public String latitude;

        @SerializedName("description")
        public String description;

        @SerializedName("name")
        public String name;

        @SerializedName("isavailable")
        public String isavailable;

        @SerializedName("id")
        public String id;
    }
}