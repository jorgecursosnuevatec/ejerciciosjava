package com.jgr.ejercicios.opcional;

import java.util.Optional;

import com.jgr.ejercicios.opcional.modelo.Computador;
import com.jgr.ejercicios.opcional.repositorio.ComputadorRepositorio;
import com.jgr.ejercicios.opcional.repositorio.IRepositorio;

/**
 * The Class EjemploRepositorioMetodosOrElseThrow.
 * lanza una excepcion en caso de que no encuentre
 */
public class EjemploRepositorioMetodosOrElseThrow {
   
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        //Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalStateException::new);
        Computador pc = repositorio.filtrar("xxx").orElseThrow(IllegalStateException::new);
        System.out.println(pc);
        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".") + 1))
                .orElseThrow();
        System.out.println(extension);


    }
}
