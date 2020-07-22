package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SubscriptionResponse {

    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("user_plan")
    public String user_plan;
    @SerializedName("error")
    public String error;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("is_limited")
        public String is_limited;
        @SerializedName("no_of_post")
        public String no_of_post;
        @SerializedName("card_link")
        public String card_link;
        @SerializedName("knet_link")
        public String knet_link;
        @SerializedName("status")
        public String status;
        @SerializedName("modifiedby")
        public String modifiedby;
        @SerializedName("addedby")
        public String addedby;
        @SerializedName("modifieddate")
        public String modifieddate;
        @SerializedName("createddate")
        public String createddate;
        @SerializedName("price")
        public String price;
        @SerializedName("noofdays")
        public String noofdays;
        @SerializedName("ar_name")
        public String ar_name;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }
}