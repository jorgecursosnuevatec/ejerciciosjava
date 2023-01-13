package com.jgr.metodos.estaticos.interfaces.otro;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class EjercicioInterfazEstatica.
 * 
 * Crear una lista de numeros con los valores 7,15,9
 * 
 * 
 * 
 */
public class EjercicioInterfazEstatica {
	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
		lista.add(7);
		lista.add(15);
		lista.add(9);
		
		Integer[] entero = {7,15,9};
		
		List<Integer> lista2 = List.of(entero);
		
		ArrayList<Integer> lista3= (ArrayList<Integer>) List.of(entero);
		

		

	}

}
