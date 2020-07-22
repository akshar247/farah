package com.farah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class OfferResponse {


    @Expose
    @SerializedName("error")
    public String error;
    @Expose
    @SerializedName("data")
    public List<DataEntity> data;
    @Expose
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @Expose
        @SerializedName("status")
        public String status;
        @Expose
        @SerializedName("modifiedby")
        public String modifiedby;
        @Expose
        @SerializedName("addedby")
        public String addedby;
        @Expose
        @SerializedName("modifieddate")
        public String modifieddate;
        @Expose
        @SerializedName("createddate")
        public String createddate;
        @Expose
        @SerializedName("priority")
        public String priority;
        @Expose
        @SerializedName("wp_mobile")
        public String wpMobile;
        @Expose
        @SerializedName("mobile")
        public String mobile;
        @Expose
        @SerializedName("description")
        public String description;
        @Expose
        @SerializedName("image")
        public String image;
        @Expose
        @SerializedName("title")
        public String title;
        @Expose
        @SerializedName("id")
        public String id;
    }
}