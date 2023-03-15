package com.jgr.lambda.simples.interfaz.modelo;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class ImplementaEjercicioLambda {

	// recibe una lista y busca las palabras que comienzan por el caracter que le
	// pasamos
	public int contarCaracteres(Collection<String> lista, Function<String, Integer> fun,
			Predicate<String> condicion) {

		int total = 0;
		for (String s : lista) {
			if (condicion.test(s)) {// condicion que tiene que cumplir
				total += fun.apply(s);// de la cadena de caracteres suma las palabras
			}

		}

		return total;

	}
	
	
}

