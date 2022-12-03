package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class OrdenaTextoComparatorFuncional.
 */
public class OrdenaTextoComparatorFuncional {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<String> textos = new ArrayList<>();

		textos.add("texto2");
		textos.add("texto");
		textos.add("texto1");
		//si objeto >parametro >0
		//si objeto==parametro 0		
		//si objeto<parametro<0

		// ordenamos por longitud con funcion lambda
		//el mismo va recorriendo el array
		textos.sort((a, b) -> a.length() - b.length());
		textos.forEach(System.out::println);
		

	}

}
