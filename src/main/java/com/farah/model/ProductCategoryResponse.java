package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductCategoryResponse {
    @SerializedName("error")
    public String error;
    @SerializedName("pagecount")
    public int pagecount;
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("publishdate")
        public String publishdate;
        @SerializedName("visitor")
        public String visitor;
        @SerializedName("count")
        public String count;
        @SerializedName("longitude")
        public String longitude;
        @SerializedName("latitude")
        public String latitude;
        @SerializedName("locationdifference")
        public String locationdifference;
        @SerializedName("price")
        public String price;
        @SerializedName("city")
        public String city;
        @SerializedName("description")
        public String description;
        @SerializedName("productimage")
        public String productimage;
        @SerializedName("productimagetype")
        public String productimagetype;
        @SerializedName("productname")
        public String productname;
        @SerializedName("ownername")
        public String ownername;
        @SerializedName("isavailable")
        public String isavailable;
        @SerializedName("productid")
        public String productid;
    }
}