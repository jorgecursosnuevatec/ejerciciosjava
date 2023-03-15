package com.jgr.interfaz.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The Class LanzadoraInterfazPredicate.
 * 
 * saca el resultado de la operacion que le pasamos al metodo calculoPorCriterio
 * que tiene como parametro una lista de integer y una funcion predicate.
 * La primera llamada la hace guardando la definicion de la funcion en una variable Predicate
 * La segunda llamada la hace implementando la funcion como parametro de la llamada
  */
public class LanzadoraInterfazPredicate {
	public static void main(String[] args) {
		
		int numero_maximo = 5;// Integer.MAX_VALUE;
		int numero_minimo = 60;// Integer.MIN_VALUE;
		
		List<Integer> lista = new ArrayList<>();
		
		lista=IntStream
 				.generate(()-> (int)(Math.random() * (numero_maximo-numero_minimo)+numero_minimo))
				.parallel()
				.distinct()
				.peek(n -> {
                    System.out.println("Nombre Thread->" + Thread.currentThread().getName()
                    + " - " + n);
                })
				.limit(5)
				.sorted()
				.boxed()
				.collect(Collectors.toList());
		
		lista.forEach(System.out::println);
		
		InterfazPredicate iFP = new InterfazPredicate();	
		
		//defino la clase anonima que verifica si es positivo usando la interface PREDICATE
		Predicate<Integer> prPositivo = new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0;				
			};
		};		
		System.out.println("Suma positivos->"+iFP.calculoPorCriterio(lista, prPositivo));
		
		//ahora los pares, en vez de crear una variable directamente le paso la interfaz anonima
		//predicate con el metodo test sobreescrito
		System.out.println("Suma positivos->"+iFP.calculoPorCriterio(lista, 
				new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t%2==0;				
			};
		}));
		
		
	}

}
