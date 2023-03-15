package com.jgr.patron.decorador2.modelo;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador2.comun.Configurable;

public class Cafe implements Configurable{
    private float precio;
    private String nombre;

    public Cafe(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
