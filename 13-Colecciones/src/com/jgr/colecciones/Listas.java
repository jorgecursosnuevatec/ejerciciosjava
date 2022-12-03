package com.jgr.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class Listas.
 */
public class Listas {

    /**
     * The main method.
     * las listas salen tal y como se declaran
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        imprimir(miLista);

    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
        System.out.println("****************************");
       
        System.out.println(coleccion.getClass().getName());

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }
    
}
