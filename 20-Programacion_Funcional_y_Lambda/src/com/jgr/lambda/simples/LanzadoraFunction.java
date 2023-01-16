package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;

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

		//recibe una lista y devuelve la suma de los cuadrados de la lista
		//le pasamos la lista de numeros y de decimos lo que tiene que hacer el function
		iPF.procesaLista(numeros, n->(n*n));
		
		//suma los cuadrados de lsa raices cubicas de cada elemento
		//probar con el andthen
		
		
 

	}

}
