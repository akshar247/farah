package com.farah.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProductFieldResponse {

    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("v_min_length")
        public Object v_min_length;
        @SerializedName("options")
        public List<OptionsEntity> options;
        @SerializedName("values")
        public List<String> values;
        @SerializedName("label")
        public String label;
        @SerializedName("hint")
        public String hint;
        @SerializedName("type")
        public String type;
        @SerializedName("key")
        public String key;
        @SerializedName("id")
        public String id;
    }

    public static class OptionsEntity {
        @SerializedName("value")
        public String value;
        @SerializedName("text")
        public String text;
        @SerializedName("key")
        public String key;
    }

    public static class V_min_lengthEntity {
        @SerializedName("value")
        public Object value;
    }
}