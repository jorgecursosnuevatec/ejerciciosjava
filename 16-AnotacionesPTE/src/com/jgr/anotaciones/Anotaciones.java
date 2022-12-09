package com.jgr.anotaciones;

import java.time.LocalDate;

import com.jgr.anotaciones.modelo.Producto;
import com.jgr.anotaciones.serializador.JsonSerializador;

public class Anotaciones {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro ROBLE");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
