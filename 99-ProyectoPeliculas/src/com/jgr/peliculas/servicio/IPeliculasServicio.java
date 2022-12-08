package com.jgr.peliculas.servicio;

import com.jgr.peliculas.modelo.Pelicula;

public interface IPeliculasServicio {

    String NOMBRE_RECURSO = "peliculas.txt";
    
    void agregarPelicula(String nombrePelicula);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();

}
