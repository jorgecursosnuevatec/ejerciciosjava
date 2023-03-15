package com.jgr.peliculas.repositorio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.jgr.peliculas.excepciones.ErrorAccesoDatos;
import com.jgr.peliculas.excepciones.ErrorEscrituraDatos;
import com.jgr.peliculas.excepciones.ErrorLecturaDatos;
import com.jgr.peliculas.modelo.Pelicula;



/**
 * The Interface IPeliculasRepositorio.
 */
public interface IPeliculasRepositorio {

    boolean existe(String nombreRecurso) throws ErrorAccesoDatos;

    List<Pelicula> listar(String nombreRecurso) throws ErrorLecturaDatos;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws ErrorEscrituraDatos;

    String buscar(String nombreRecurso, String buscar) throws ErrorLecturaDatos;

    void crear(String nombreRecurso) throws ErrorAccesoDatos;

    void borrar(String nombreRecurso) throws ErrorAccesoDatos;
}