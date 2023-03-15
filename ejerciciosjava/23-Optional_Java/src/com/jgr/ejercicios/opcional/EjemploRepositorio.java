package com.jgr.ejercicios.opcional;
import com.jgr.ejercicios.opcional.modelo.*;
import com.jgr.ejercicios.opcional.repositorio.ComputadorRepositorio;
import com.jgr.ejercicios.opcional.repositorio.IRepositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

        IRepositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("rog").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));

        //Optional<Computador> pc = repositorio.filtrar("asus rog");

        /*if(pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontró");
        }*/
    }
}
