package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {

    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("subcategory")
        public List<SubcategoryEntity> subcategory;
        @SerializedName("arabic")
        public String arabic;
        @SerializedName("image")
        public String image;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }

    public static class SubcategoryEntity {
        @SerializedName("subsubcategory")
        public List<SubsubcategoryEntity> subsubcategory;
        @SerializedName("arabic")
        public String arabic;
        @SerializedName("image")
        public String image;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }

    public static class SubsubcategoryEntity {
        @SerializedName("subsubsubcategory")
        public List<SubsubsubcategoryEntity> subsubsubcategory;
        @SerializedName("arabic")
        public String arabic;
        @SerializedName("image")
        public String image;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }

    public static class SubsubsubcategoryEntity {
        @SerializedName("total")
        public String total;
        @SerializedName("arabic")
        public String arabic;
        @SerializedName("image")
        public String image;
        @SerializedName("name")
        public String name;
        @SerializedName("id")
        public String id;
    }
}