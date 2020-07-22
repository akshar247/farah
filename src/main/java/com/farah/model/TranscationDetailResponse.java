package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TranscationDetailResponse {
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("error")
    public String error;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("filetype")
        public String filetype;
        @SerializedName("file")
        public String file;
        @SerializedName("id")
        public String id;
        @SerializedName("slug")
        public String slug;
        @SerializedName("avaiable_post")
        public String avaiable_post;
        @SerializedName("transaction_id")
        public String transaction_id;
        @SerializedName("no_of_post")
        public String no_of_post;
        @SerializedName("noofdays")
        public String noofdays;
        @SerializedName("product_name")
        public String product_name;
        @SerializedName("subscription_name")
        public String subscription_name;
        @SerializedName("product_id")
        public String product_id;
        @SerializedName("subcription_id")
        public String subcription_id;
        @SerializedName("user_id")
        public String user_id;
        @SerializedName("name")
        public String name;
    }
}