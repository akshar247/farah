package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TranscationResponse {
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("error")
    public String error;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("plan_no_of_post")
        public String plan_no_of_post;
        @SerializedName("lastname")
        public String lastname;
        @SerializedName("firstname")
        public String firstname;
        @SerializedName("is_limited")
        public String is_limited;
        @SerializedName("tr_no_of_post")
        public String tr_no_of_post;
        @SerializedName("name")
        public String name;
        @SerializedName("ar_name")
        public String ar_name;
        @SerializedName("noofdays")
        public String noofdays;
        @SerializedName("price")
        public String price;
        @SerializedName("subscription_name")
        public String subscription_name;
        @SerializedName("updated_at")
        public String updated_at;
        @SerializedName("created_at")
        public String created_at;
        @SerializedName("no_of_post")
        public String no_of_post;
        @SerializedName("status")
        public String status;
        @SerializedName("subcription_plan_id")
        public String subcription_plan_id;
        @SerializedName("user_id")
        public String user_id;
        @SerializedName("transaction_id")
        public String transaction_id;
        @SerializedName("id")
        public String id;
    }
}