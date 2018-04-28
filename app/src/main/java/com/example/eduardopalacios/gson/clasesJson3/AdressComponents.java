package com.example.eduardopalacios.gson.clasesJson3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eduardopalacios on 27/04/18.
 */

public class AdressComponents {

    @SerializedName("long_name")
    @Expose
    String long_name;
    @SerializedName("short_name")
    @Expose
    String short_name;

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }
}
