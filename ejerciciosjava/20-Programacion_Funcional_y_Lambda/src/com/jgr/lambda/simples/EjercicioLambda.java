package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.jgr.lambda.simples.interfaz.modelo.ImplementaEjercicioLambda;

public class EjercicioLambda {

	
	public static void main(String[] args) {
		
		
		List<String> listaPalabras = new ArrayList<>();
		
		listaPalabras.add("Salida");
		listaPalabras.add("Armario");
		listaPalabras.add("Luna");
		listaPalabras.add("Amarillo");
		
		
		//metodo que recibe una lista de caracteres y devuelve el total de palabras que empiezan por "a"
		
		ImplementaEjercicioLambda iEL = new ImplementaEjercicioLambda();
		
		System.out.println(iEL.contarCaracteres(listaPalabras
				, c->{ //function que lo que hace es pasarle un String y devolver un integer
			int vocales=0;
			for(int i=0;i<c.length();i++) {
				switch(c.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
				}
			}
			return vocales;
		}, c->c.startsWith("a")));//predicate que confirma que empieza por "a"
		
		
		
		//metodo que recibe una lista de palabras que devuelve el total de caracteres de todas las que tienen mas
		//de 5 letras
				  
		iEL.contarCaracteres(listaPalabras,
				c->c.length(),				
				c->c.length()>5);
		
		
	}

}
