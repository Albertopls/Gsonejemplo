package com.example.eduardopalacios.gson.clasesJson3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardopalacios on 27/04/18.
 */

public class Sitio {

    @SerializedName("formatted_address")
    @Expose
    String formatted_address;
    @SerializedName("location")
    @Expose
    Location location;
    @SerializedName("address_components")
    @Expose
    List<AdressComponents> adressComponents=new ArrayList<>();


    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<AdressComponents> getAdressComponents() {
        return adressComponents;
    }

    public void setAdressComponents(List<AdressComponents> adressComponents) {
        this.adressComponents = adressComponents;
    }
}
