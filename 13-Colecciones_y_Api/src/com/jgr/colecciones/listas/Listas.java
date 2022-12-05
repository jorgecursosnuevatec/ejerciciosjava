package com.jgr.colecciones.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * The Class Listas.
 *     /**
     * The main method.
     * mantiene el orden
     * admiten duplicados
     * usa equals para comparar
     * ARRAYLIST->acceso lectura muy rapido,pero eliminar/modificar tarda mas porque no deja espacios vacios
     * LINKED LIST->listas enlazadas,es mas rapido que la lista para modificaciones,tarda mas en buscar aleatoria
     * 				trabaja con pilas/colas
     * VECTOR->parecido al arraylist,es sincronizado/protegido para concurrencia cuando acceden varios hilos a la vez solo lo usa uno 
     *		   costoso en rendimiento
 */
public class Listas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<String>();
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
