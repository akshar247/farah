package com.farah.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public  class CommentResponse {

    @Expose
    @SerializedName("error")
    public boolean error;
    @Expose
    @SerializedName("data")
    public List<DataEntity> data;
    @Expose
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @Expose
        @SerializedName("member_id")
        public String member_id;
        @Expose
        @SerializedName("image")
        public String image;
        @Expose
        @SerializedName("name")
        public String name;
        @Expose
        @SerializedName("lastname")
        public String lastname;
        @Expose
        @SerializedName("firstname")
        public String firstname;
        @Expose
        @SerializedName("created_at")
        public String created_at;
        @Expose
        @SerializedName("comment")
        public String comment;
        @Expose
        @SerializedName("id")
        public String id;
    }
}