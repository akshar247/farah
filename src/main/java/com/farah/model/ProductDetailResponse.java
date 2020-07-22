package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductDetailResponse {

    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public DataEntity data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("shareurl")
        public String shareurl;
        @SerializedName("totalcommnet")
        public int totalcommnet;
        @SerializedName("productfields")
        public List<ProductfieldsEntity> productfields;
        @SerializedName("productfile")
        public List<ProductfileEntity> productfile;
        @SerializedName("locationdifference")
        public double locationdifference;
        @SerializedName("isWanted")
        public String isWanted;
        @SerializedName("isFavourite")
        public String isFavourite;
        @SerializedName("governorate")
        public String governorate;
        @SerializedName("governorateid")
        public String governorateid;
        @SerializedName("governoratecity")
        public String governoratecity;
        @SerializedName("governoratecityid")
        public String governoratecityid;
        @SerializedName("publishdate")
        public String publishdate;
        @SerializedName("block_name")
        public String block_name;
        @SerializedName("createddate")
        public String createddate;
        public String getLikes() {
            return likes;
        }

        public void setLikes(String likes) {
            this.likes = likes;
        }

        @SerializedName("likes")
        public String likes;
        @SerializedName("ownerimage")
        public String ownerimage;
        @SerializedName("ownername")
        public String ownername;
        @SerializedName("subsubsubcategoryname_arabic")
        public String subsubsubcategoryname_arabic;
        @SerializedName("subsubsubcategoryname")
        public String subsubsubcategoryname;
        @SerializedName("subsubcategoryname_arabic")
        public String subsubcategoryname_arabic;
        @SerializedName("subsubcategoryname")
        public String subsubcategoryname;
        @SerializedName("subcategoryname_arabic")
        public String subcategoryname_arabic;
        @SerializedName("subcategoryname")
        public String subcategoryname;
        @SerializedName("categoryname_arabic")
        public String categoryname_arabic;
        @SerializedName("categoryname")
        public String categoryname;
        @SerializedName("instagramurl")
        public String instagramurl;
        @SerializedName("googleurl")
        public String googleurl;
        @SerializedName("facebookurl")
        public String facebookurl;
        @SerializedName("websiteurl")
        public String websiteurl;
        @SerializedName("city")
        public String city;
        @SerializedName("ownerid")
        public String ownerid;
        @SerializedName("price")
        public String price;
        @SerializedName("email")
        public String email;
        @SerializedName("mobileno")
        public String mobileno;
        @SerializedName("views")
        public String views;
        @SerializedName("description")
        public String description;
        @SerializedName("name")
        public String name;
        @SerializedName("isavailable")
        public String isavailable;
        @SerializedName("address")
        public String address;
        @SerializedName("longitude")
        public String longitude;
        @SerializedName("latitude")
        public String latitude;
        @SerializedName("youtubeurl")
        public String youtubeurl;
        @SerializedName("subsubsubcategoryid")
        public String subsubsubcategoryid;
        @SerializedName("subsubcategoryid")
        public String subsubcategoryid;
        @SerializedName("subcategoryid")
        public String subcategoryid;
        @SerializedName("categoryid")
        public String categoryid;
        @SerializedName("productid")
        public String productid;
        @SerializedName("expirydate")
        public String expirydate;
        @SerializedName("slug")
        public String slug;
        @SerializedName("sharephonenumber")
        public String sharephonenumber;
        @SerializedName("id")
        public String id;
        @SerializedName("street")
        public String street;
        @SerializedName("jada")
        public String jada;

    }

    public static class ProductfieldsEntity {
        @SerializedName("arabiclabel")
        public String arabiclabel;
        @SerializedName("value")
        public String value;
        @SerializedName("label")
        public String label;
        @SerializedName("id")
        public String id;
    }

    public static class ProductfileEntity {
        @SerializedName("videothumb")
        public String videothumb;
        @SerializedName("file")
        public String file;
        @SerializedName("filetype")
        public String filetype;
        @SerializedName("id")
        public String id;
    }
}