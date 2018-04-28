package com.example.eduardopalacios.gson.clasesJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eduardopalacios on 26/04/18.
 */

public class Jugador {
    @SerializedName("nombre")
    @Expose
    String nombre;
    @SerializedName("equipo")
    @Expose
    String equipo;
    @SerializedName("posicion")
    @Expose
    String posicion;
    @SerializedName("numero")
    @Expose
    int numero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }


}
