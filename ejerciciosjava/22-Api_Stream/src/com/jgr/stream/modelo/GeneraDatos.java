package com.jgr.stream.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import com.github.javafaker.Faker;

import lombok.ToString;




@ToString
public class GeneraDatos {
	
	
	private static List<Integer> listaInteger=null;
	private static List<Double> listaDouble=null;
	private static List<String> listaString=null;
	private static List<Date> listaDate=null;
	
	
	
	private static Faker faker;
	public GeneraDatos() {
		super();
			
		listaInteger = new ArrayList<Integer>();
		listaDouble = new ArrayList<Double>();
		listaString = new ArrayList<String>();
		listaDate = new ArrayList<Date>();
		
	}
	public static Iterable<Integer> getListaInteger(int cuantasOcurrencias) {
		
		if (listaInteger==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaInteger.add(faker.number().numberBetween(-9999, 9999));			
		}
		return listaInteger;
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
	
	public static Iterable<Integer> getListaIntegerRango(int cuantasOcurrencias,int min,int max) {
		
		if (listaInteger==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaInteger.add(faker.number().numberBetween(min, max));			
		}
		return listaInteger;
	}
	
	public static Iterable <Double> getListaDouble(int cuantasOcurrencias) {
		
		if (listaDouble==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaDouble.add(faker.number().randomDouble(2, -999999, 999999));			
		}
		return listaDouble;
	}
	public static Iterable <Double> getListaDoubleRango(int cuantasOcurrencias,int decimales,int min,int max) {
		if (listaDouble==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaDouble.add(faker.number().randomDouble(decimales,min,max));			
		}
		return listaDouble;
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
	
	public static Iterable <String> getListaStringChuck(int cuantasOcurrencias) {
		if (listaString==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaString.add(faker.chuckNorris().fact());			
		}
		
		return listaString;
	}
	public static Iterable <String> getListaStringYoda(int cuantasOcurrencias) {
		if (listaString==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaString.add(faker.yoda().quote());			
		}
		
		return listaString;
	}
	
	public static Iterable <String> getListaStringGame(int cuantasOcurrencias) {
		if (listaString==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaString.add(faker.gameOfThrones().quote());			
		}
		
		return listaString;
	}
	public static Iterable <String> getListaStringBeer(int cuantasOcurrencias) {
		if (listaString==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaString.add(faker.beer().name());			
		}
		
		return listaString;
	}
	
	public static Iterable <Date> getListaDate(int cuantasOcurrencias) {
		if (listaDate==null) {			
			new GeneraDatos();
		}
		
		for (int i= 0;i<cuantasOcurrencias;i++) {
			faker = new Faker();			
			listaDate.add(faker.date().birthday(1, 999));			
		}
		
		return listaDate;
	}

	
	
	
	


}
