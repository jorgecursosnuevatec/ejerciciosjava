package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaBiPredicate;

/**
 * The Class LanzadoraFuncionPredicate.
 * 
 * Dispone del método abstracto test, que a partir de un objeto realiza una comprobación y DEVUELVE un boolean
 * saca el resultado de la suma de la lista con la condicion que le pasamos como parametro Predicate
 * 
 * 
 * 
 */
public class LanzadoraPredicate {
	public static void main(String[] args) {
		
		int numero_maximo = 5;// Integer.MAX_VALUE;
		int numero_minimo = 60;// Integer.MIN_VALUE;
		
		List<Integer> lista = new ArrayList<>();
		
		new GeneraListaNumeros();
		lista = GeneraListaNumeros.getLista();
		
		ImplementaBiPredicate iFP = new ImplementaBiPredicate();						
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
		
		//aqui le paso directamente la lambda preguntando si es mayor que cero
		System.out.println("Suma positivos->"+iFP.calculoPorCriterio(lista,t->t>0)); 
		
		//default Predicate<T>	and​(Predicate<? super T> other)	
		//Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.		
		Predicate<Integer> sumaMetodos = lambdaSuma.and(t->t>0);
		
		List<Integer> listaInt = List.of(1,2,3,-1);
		
		System.out.println("Suma positivos y pares->"+iFP.calculoPorCriterio(listaInt, sumaMetodos));
		
	}

}
