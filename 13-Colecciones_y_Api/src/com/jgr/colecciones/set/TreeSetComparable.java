package com.jgr.colecciones.set;

import java.util.Set;
import java.util.TreeSet;

import com.jgr.colecciones.modelo.Alumno;

/**
 * The Class TreeSetComparable.
 * TreeSet-> es ordenado,pero no permite duplicados. Ordena cuando se modifica 
 */
public class TreeSetComparable {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
//        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 8));//este esta duplicado
        System.out.println(sa);
    }

	
}
