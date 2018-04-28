package com.example.eduardopalacios.gson.clasesJson3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eduardopalacios on 27/04/18.
 */

public class Location {

    @SerializedName("lat")
    @Expose
    Double lat;
    @SerializedName("lng")
    @Expose
    Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
