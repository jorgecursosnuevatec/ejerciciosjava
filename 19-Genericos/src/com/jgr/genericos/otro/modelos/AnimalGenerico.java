package com.jgr.genericos.otro.modelos;

public class AnimalGenerico {


    private String nombre;
    private String tipo;

    public AnimalGenerico(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}