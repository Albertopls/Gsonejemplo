package com.example.eduardopalacios.gson.clasesJson2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by eduardopalacios on 26/04/18.
 */

public class Persona {

    @SerializedName("Nombre")
    @Expose
    String Nombre;
    @SerializedName("Apellido")
    @Expose
    String Apellido;

    @SerializedName("Edad")
    @Expose
    int Edad;
    @SerializedName("Direccion")
    @Expose
    Direccion direccion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

}
