package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaFunction;

/**
 * The Class LanzadoraFunction.
 * 
 * Método abstracto apply, que a partir de un objeto realiza una operación y devuelve un resultado
 */
public class LanzadoraFunction {


	public static void main(String[] args) {
				
	ImplementaFunction iPF = new ImplementaFunction();
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros = new GeneraListaNumeros().getLista();

		//recibe una lista y devuelve la suma de los cuadrados de la lista
		//le pasamos la lista de numeros y de decimos lo que tiene que hacer el function
		
		System.out.println("\nSuma de los cuadrados de la lista->"+iPF.procesaLista(numeros, n->(n*n)));
		
		//suma los cuadrados de lsa raices cubicas de cada elemento
		//probar con el andthen
		
		Function<Integer,Integer> suma = (n)->(n+n);
		Function<Integer,Integer> multiplica = (n)->(n*n);
		//Returns a composed function that first applies this function to its input, 
		//and then applies the after function to the result.
		Function<Integer,Integer> todoAndThen = suma.andThen(multiplica);
		
		//Returns a composed function that first applies the before function to its input, 
		//and then applies this function to the result.		
		Function<Integer,Integer> todoCompose = multiplica.compose(suma);
		
		
		System.out.println("\nSuma de los cuadrados de la lista SEPARADO->"+iPF.procesaLista(numeros,suma.andThen(multiplica)));
		System.out.println("\nSuma de los cuadrados de la lista TODOANDTHEN->"+iPF.procesaLista(numeros,todoAndThen));
		System.out.println("\nSuma de los cuadrados de la lista TODOCOMPOSE->"+iPF.procesaLista(numeros,todoCompose));
				

	}

}
