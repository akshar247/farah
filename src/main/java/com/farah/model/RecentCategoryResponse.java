package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RecentCategoryResponse {

    @SerializedName("pagecount")
    public int pagecount;
    @SerializedName("error")
    public String error;

    @SerializedName("data")
    public List<DataEntity> data;

    @SerializedName("result")
    public String result;

    public static class DataEntity {

        @SerializedName("longitude")
        public String longitude;

        @SerializedName("latitude")
        public String latitude;

        @SerializedName("price")
        public String price;

        @SerializedName("city")
        public String city;
        @SerializedName("address")
        public String address;

        @SerializedName("locationdifference")
        public String locationdifference;

        @SerializedName("publishdate")
        public String publishdate;
        @SerializedName("visitor")
        public String visitor;
        @SerializedName("description")
        public String description;

        @SerializedName("productimage")
        public String productimage;

        @SerializedName("mobileno")
        public String mobileno;

        @SerializedName("productimagetype")
        public String productimagetype;

        @SerializedName("productname")
        public String productname;

        @SerializedName("ownername")
        public String ownername;

        @SerializedName("isavailable")
        public String isavailable;

        @SerializedName("expirydate")
        public String expirydate;

        @SerializedName("productid")
        public String productid;
    }
}