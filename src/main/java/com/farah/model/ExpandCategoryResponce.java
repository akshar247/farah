package com.farah.model;

import com.google.gson.annotations.SerializedName;

public class ExpandCategoryResponce {

    @SerializedName("categoryname")
    public String categoryname = "";
    @SerializedName("ar_categoryname")
    public String ar_categoryname = "";
    @SerializedName("categorynameid")
    public String categorynameid = "";

    @SerializedName("subcategoryname")
    public String subcategoryname = "";
    @SerializedName("ar_subcategoryname")
    public String ar_subcategoryname = "";
    @SerializedName("subcategoryid")
    public String subcategoryid = "";

    @SerializedName("subsubcategoryname")
    public String subsubcategoryname = "";
    @SerializedName("ar_subsubcategoryname")
    public String ar_subsubcategoryname = "";
    @SerializedName("subsubcategoryid")
    public String subsubcategoryid = "";

    @SerializedName("subsubsubcategoryname")
    public String subsubsubcategoryname = "";
    @SerializedName("ar_subsubsubcategoryname")
    public String ar_subsubsubcategoryname = "";
    @SerializedName("subsubsubcategoryid")
    public String subsubsubcategoryid = "";

}