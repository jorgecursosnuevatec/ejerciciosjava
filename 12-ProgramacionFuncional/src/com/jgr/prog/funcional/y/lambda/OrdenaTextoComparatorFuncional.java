package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.List;

public class OrdenaTextoComparatorFuncional {

	

	public static void main(String[] args) {
		List<String> textos = new ArrayList<>();

		textos.add("texto2");
		textos.add("texto");
		textos.add("texto1");
		//si objeto >parametro >0
		//si objeto==parametro 0		
		//si objeto<parametro<0

		// ordenamos por longitud con funcion lambda
		textos.sort((a, b) -> a.length() - b.length());
		textos.forEach(System.out::println);

	}

}
