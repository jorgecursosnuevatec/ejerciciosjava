package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaPredicate;

/**
 * The Class LanzadoraFuncionPredicate.
 * 
 * Dispone del método abstracto test, que a partir de un objeto realiza una comprobación y devuelve un boolean
 * 
 * 
 * https://mkyong.com/tag/functional-interface/
 * 
 */
public class LanzadoraPredicate {
	public static void main(String[] args) {
		
		int numero_maximo = 5;// Integer.MAX_VALUE;
		int numero_minimo = 60;// Integer.MIN_VALUE;
		
		List<Integer> lista = new ArrayList<>();
		
		new GeneraListaNumeros();
		lista = GeneraListaNumeros.getLista();
	
		
		ImplementaPredicate iFP = new ImplementaPredicate();						
		//defino la clase anonima que verifica si es positivo
		Predicate<Integer> prPositivo = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0;				
			};
		};		
		System.out.println("Mayores que cero ->"+iFP.calculoPorCriterio(lista, prPositivo));
		
		//ahora los pares, en vez de crear una variable directamente le paso la interfaz anonima
		//predicate con el metodo test sobreescrito
		System.out.println("Numeros pares->"+iFP.calculoPorCriterio(lista, 
				new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;				
			};
		}));
		
		
		//ahora defino el predicate como una lambda
		Predicate<Integer> lambdaSuma = t->t%2==0;		
		System.out.println("Suma positivos->"+iFP.calculoPorCriterio(lista,lambdaSuma));
		//
		System.out.println("Suma positivos->"+iFP.calculoPorCriterio(lista,t->t>0)); 
	}

}
