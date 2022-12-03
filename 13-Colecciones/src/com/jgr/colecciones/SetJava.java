package com.jgr.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO: Auto-generated Javadoc
/**
 * The Class SetJava.
 */
public class SetJava {

	/**
	 * The main method.
	 * los set salen en orden aleatorio
	 * no se pueden duplicar valores
	 */
	public static void main(String[] args) {
		List miLista = new ArrayList();
		miLista.add("Lunes");
		miLista.add("Martes");
		miLista.add("Miercoles");
		miLista.add("Jueves");
		miLista.add("Viernes");
		miLista.add("Viernes");
		imprimir(miLista);

		Set miSet = new HashSet();
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
