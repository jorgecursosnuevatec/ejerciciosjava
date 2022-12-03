package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class EjercicioOrdenaYMuestraPares.
 */
public class EjercicioOrdenaYMuestraPares {

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
	
		List<Integer> nums = List.of(10,25,33,80,12,4,55,8);
		
		List<Integer> datos = new ArrayList<>(nums);
		
		datos.removeIf(n->n%2!=0);//elimino impares
		//ahora ordeno de menor a mayor
		datos.sort((a,b)->b-a);
		
		
		//tambien podria ordenarse asi
		//datos.sort(Comparator.reverseOrder());
		
		datos.forEach(System.out::println);
		
		List<Persona> personas = new ArrayList<>(
				List.of(new Persona("Nombre3",66),new Persona("Nombre2",67),
						new Persona("Nombre1",66),new Persona("Nombre3",67))
				);
		
		personas.sort((a,b)->a.getEdad()-b.getEdad());
		
		personas.forEach(System.out::println);
		System.out.println("*****");
		
		personas.sort((a,b)->a.getNombre().length()-b.getNombre().length());
		
		personas.forEach(System.out::println);
		System.out.println("*****");
		
		//la ordena al reves
		personas.sort(Comparator.reverseOrder());
		personas.forEach(System.out::println);
		
	}

}
