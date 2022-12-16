package com.jgr.prog.funcional.y.lambda;

import java.util.Arrays;

import com.jgr.prog.funcional.y.lambda.models.Persona;

/**
 * The Class ComparableInterfazOrdenaTexto.
 */
public class ComparableInterfazOrdenaTexto {

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
