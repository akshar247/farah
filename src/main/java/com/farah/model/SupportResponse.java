package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class SupportResponse {
    @SerializedName("error")
    public String error;
    @SerializedName("data")
    public DataEntity data;
    @SerializedName("result")
    public String result;

    public static class DataEntity {
        @SerializedName("app_code")
        public String app_code;
    }
}