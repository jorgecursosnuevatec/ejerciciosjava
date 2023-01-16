package com.jgr.lambda.simples.interfaz.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class GeneraListaNumeros {
	
	
	private static List<Integer> lista;
	private static List<Double> listaD;
	private final static int LIMITE = 5;	
	private final static int numero_maximo = 49;// Integer.MAX_VALUE;
	private final static int numero_minimo = 1;// Integer.MIN_VALUE;
	
	
	public GeneraListaNumeros(){
		
		this.lista = new ArrayList<Integer>();
		this.listaD = new ArrayList<Double>();
		
	
		 
	}


	public static List<Integer> getLista() {
		 return lista = IntStream
	 				.generate(()-> (int)(Math.random() * (numero_maximo-numero_minimo)+numero_minimo))
//					.generate(()-> (int)(Math.random() * (Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE))
					.parallel()
					.distinct()
					/*
					.peek(n -> {
	                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
	                    + " - " + n);
	                })
	                */
					.limit(LIMITE)
//					.limit(Integer.MAX_VALUE)
//					.sorted()
					.boxed().collect(Collectors.toList())
					;
			 
	}

	public List<Double> getListaDouble() {
		
		return this.listaD = DoubleStream
				.generate(()-> (Math.random() * (numero_maximo-numero_minimo)+numero_minimo))
//					.generate(()-> (int)(Math.random() * (Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE))
				.parallel()
				.distinct()
				/*
					.peek(n -> {
	                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
	                    + " - " + n);
	                })
				 */
				.limit(LIMITE)
//					.limit(Integer.MAX_VALUE)
//					.sorted()
				.boxed().collect(Collectors.toList())
				;
		
	}
	


}
