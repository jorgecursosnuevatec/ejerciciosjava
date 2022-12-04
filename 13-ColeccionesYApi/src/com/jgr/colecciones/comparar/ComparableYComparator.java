package com.jgr.colecciones.comparar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.jgr.colecciones.modelo.Alumno;

// TODO: Auto-generated Javadoc
/**
 * The Class ComparableYComparator.
 * Comparable es la interfaz que debe implementar el metodo en la clase que lo usa
 * Comparator es otra clase
 */
public class ComparableYComparator {
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Alumno> sa = new ArrayList<Alumno>();
		// List<Alumno> sa = new LinkedList<>();
		sa.add(new Alumno("Pato", 5));
		sa.add(new Alumno("Cata", 6));
		sa.add(new Alumno("Luci", 4));
		sa.add(new Alumno("Jano", 7));
		sa.add(new Alumno("Andres", 3));
		sa.add(new Alumno("Zeus2", 2));
		sa.add(new Alumno("Zeus", 2));
		sa.add(new Alumno("Lucas", 2));
		sa.add(new Alumno("Lucas", 2));// esta repetido solo sale uno
		sa.add(new Alumno("Lucas", 4));
		// System.out.println(sa);

		// compara el objeto,definido en alumno
		Collections.sort(sa, (a, b) -> a.compareTo(b));

		// Decido el campo por el que comparo
		Collections.sort(sa, (a, b) -> a.getNota().compareTo(b.getNota()));

		Collections.sort(sa, (a, b) -> a.getNombre().compareTo(b.getNombre()));

		// usando la funcion lambda
		sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
		// se puede poner asi
		sa.sort(Comparator.comparing(Alumno::getNombre));

		System.out.println("Iterando usando un foreach");
		for (Alumno a : sa) {
			System.out.println(a.getNombre());
		}

	}
}
