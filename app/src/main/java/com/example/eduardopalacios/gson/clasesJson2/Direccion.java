package com.example.eduardopalacios.gson.clasesJson2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eduardopalacios on 26/04/18.
 */

public class Direccion {


    @SerializedName("calleDireccion")
    @Expose
    String calleDireccion;
    @SerializedName("Ciudad")
    @Expose
    String Ciudad;
    @SerializedName("Delegacion")
    @Expose
    String Delegacion;
    @SerializedName("codigoPostal")
    @Expose
    int codigoPostal;

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDelegacion() {
        return Delegacion;
    }

    public void setDelegacion(String delegacion) {
        Delegacion = delegacion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
