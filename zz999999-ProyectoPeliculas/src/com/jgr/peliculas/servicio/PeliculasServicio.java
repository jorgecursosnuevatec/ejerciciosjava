package com.jgr.peliculas.servicio;

import com.jgr.peliculas.excepciones.ErrorAccesoDatos;
import com.jgr.peliculas.modelo.Pelicula;
import com.jgr.peliculas.repositorio.IPeliculasRepositorio;
import com.jgr.peliculas.repositorio.PeliculasRepositorio;

public class PeliculasServicio implements IPeliculasServicio{
	  
    private final  IPeliculasRepositorio datos;

    public PeliculasServicio() {
        this.datos = new PeliculasRepositorio();
    }
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (ErrorAccesoDatos ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for(var pelicula: peliculas){
                System.out.println("pelicula = " + pelicula);
            }
        } catch (ErrorAccesoDatos ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (ErrorAccesoDatos ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
                for (int i =0;i<5;i++) {
                	Pelicula peli = new Pelicula("Pelicula"+i);
                	datos.escribir(peli, NOMBRE_RECURSO, true);
                }
            }
            else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (ErrorAccesoDatos ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }
    
}
