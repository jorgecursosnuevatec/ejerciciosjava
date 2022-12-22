package com.jgr.prog.funcional.y.lambda.models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

import com.jgr.anotaciones.serializador.Init;
import com.jgr.anotaciones.serializador.JsonAtributo;

/**
 * The Class Producto.
 * aqui relacionamos esto con los JsonAtributo
 */
public class Producto {

    /** The nombre. */
    @JsonAtributo()
    private String nombre;

    /** The precio. */
    @JsonAtributo(nombre = "coste")
    private Long precio;

    /** The fecha. */
    private LocalDate fecha;

    /**
     * Inits the.
     * esta es una anotacion 
     */
    @Init
    private void init(){
        this.nombre = Arrays.stream(nombre.split(" "))
                .map(palabra -> palabra.substring(0, 1).toUpperCase()
                        + palabra.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the precio.
     *
     * @return the precio
     */
    public Long getPrecio() {
        return precio;
    }

    /**
     * Sets the precio.
     *
     * @param precio the new precio
     */
    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    /**
     * Gets the fecha.
     *
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Sets the fecha.
     *
     * @param fecha the new fecha
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
