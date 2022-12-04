package com.jgr.colecciones.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class EjemploTreeSet.
 * TreeSet-> es ordenado,pero no permite duplicados. Ordena cuando se modifica 
 */
public class EjemploTreeSet {
	 
 	/**
 	 * The main method.
 	 *
 	 * @param args the arguments
 	 */
 	public static void main(String[] args) {

	        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

	        ts.add("uno");
	        ts.add("dos");
	        ts.add("tres");
	        ts.add("tres");
	        ts.add("cuatro");
	        ts.add("cinco");

	        System.out.println("ts = " + ts);
	        
	        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
	        numeros.add(1);
	        numeros.add(5);
	        numeros.add(4);
	        numeros.add(2);
	        numeros.add(3);
	        numeros.add(10);
	        System.out.println("numeros = " + numeros);
	    }
	}



