package com.jgr.colecciones.set.conjunto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * The Class SetJava.
 * Extiende la interfaz Collection y de ahi la interface Set
 * NO admiten duplicados y NO mantiene el orden
 * Por debajo trabajan con Map
 * HashSet-> no mantiene el orden,ni el de insercion,se puede usar comparable,sus elementos 
 * tienen que implementar hashcode
 * 
 * LinkedHashSet-> hereda de HashSet,trabaja tb con lista enlazada. 
 * Mantiene el orden en el que se añaden elementos
 * 
 * TreeSetEjemplo-> es ordenado,pero no permite duplicados. Ordena cuando se modifica
 * 
 */
public class SetJava {

	/**
	 * The main method.
	 * los set salen en orden aleatorio
	 * no se pueden duplicar valores
	 */
	public static void main(String[] args) {
		//en la lista SI se pueden duplicar valores, y SI se mantiene el orden de insercion
		List<String> miLista = new ArrayList<String>();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Viernes");
		imprimir(miLista);

		//en el set NO se pueden duplicar y NO se mantiene el orden de insercion
		Set<String> miSet = new HashSet<String>();
		miSet.add("Lunes");
		miSet.add("Martes");
		miSet.add("Miercoles");
		miSet.add("Jueves");
		miSet.add("Viernes");
		miSet.add("Viernes");
		imprimir(miSet);
	}


	   public static void imprimir(Collection coleccion) {
		   System.out.println("****************************");
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
      
       
        System.out.println(coleccion.getClass().getName());

//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
    }

}
