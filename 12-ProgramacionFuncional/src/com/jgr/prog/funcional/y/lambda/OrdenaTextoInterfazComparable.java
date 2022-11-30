package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrdenaTextoInterfazComparable {


	public static void main(String[] args) {
		
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
