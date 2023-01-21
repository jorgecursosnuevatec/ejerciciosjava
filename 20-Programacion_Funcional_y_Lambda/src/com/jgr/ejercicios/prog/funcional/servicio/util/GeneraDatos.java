package com.jgr.ejercicios.prog.funcional.servicio.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;



public class GeneraDatos {
	
	
	private static List<Integer> listaInteger=null;
	private static List<Double> listaDouble=null;
	private static List<String> listaString=null;
	private static List<Date> listaDate=null;
	
	
	
	public GeneraDatos() {
		super();
			
		listaInteger = new ArrayList<Integer>();
		listaDouble = new ArrayList<Double>();
		listaString = new ArrayList<String>();
		listaDate = new ArrayList<Date>();
		
	}
	
	
	public static Iterable<Integer> getListaIntegerStreamRango(int cuantasOcurrencias,int min,int max) {
		
		if (listaInteger==null) {			
			new GeneraDatos();
		}
		
		return listaInteger = IntStream
	 				.generate(()-> (int)(Math.random() * (max-min)+min))
//					.generate(()-> (int)(Math.random() * (Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE))
					.parallel()
					.distinct()
					/*
					.peek(n -> {
	                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
	                    + " - " + n);
	                })
	                */
					.limit(cuantasOcurrencias)
//					.limit(Integer.MAX_VALUE)
//					.sorted()
					.boxed().collect(Collectors.toList())
					;
			 
			 
	}
	

	
	
	
	public static Iterable <Double> getListaDoubleStreamRango(int cuantasOcurrencias,int min,int max) {
		if (listaDouble==null) {			
			new GeneraDatos();
		}
		return listaDouble = DoubleStream
 				.generate(()-> (Math.random() * (max-min)+min))
//				.generate(()-> (int)(Math.random() * (Integer.MAX_VALUE-Integer.MIN_VALUE)+Integer.MIN_VALUE))
				.parallel()
				.distinct()
				/*
				.peek(n -> {
                    System.out.println("Nombre Thread: " + Thread.currentThread().getName()
                    + " - " + n);
                })
                */
				.limit(cuantasOcurrencias)
//				.limit(Integer.MAX_VALUE)
//				.sorted()
				.boxed().collect(Collectors.toList())
				;
		 
	}
	
	
	
	

	
	


	
	
	
	


}
