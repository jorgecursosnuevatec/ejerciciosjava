package com.jgr.prog.funcional.y.lambda;

import java.util.Arrays;

// TODO: Auto-generated Javadoc
/**
 * The Class OrdenaTextoInterfazComparable.
 */
public class OrdenaTextoInterfazComparable {


	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//persona implementa comparable
		Persona lista []= {
				new Persona("Nombre3",66),new Persona("Nombre2",67),
				new Persona("Nombre1",66),new Persona("Nombre3",67)
				};
		
		Arrays.sort(lista);
		for (Persona persona : lista) {
			System.out.println(persona.getNombre().concat("/").concat(String.valueOf(persona.getEdad())));
			
		}


	}

}