package com.jgr.colecciones.listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jgr.colecciones.modelo.Alumno;

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
        
        Alumno al = new Alumno("nombre", 15);
        Alumno al1 = new Alumno("nombre2", 15);
        Alumno al2 = new Alumno("nombre3", 15);
        Alumno al3 = new Alumno("nombre4", 15);
        Alumno al4 = new Alumno("nombre4", 15);
        
        List<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos = List.of(al,al1,al2,al3,al4);
        imprimir(alumnos);

    }
    
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
       
       
        System.out.println(coleccion.getClass().getName());
        System.out.println("****************************");

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }
    
}
