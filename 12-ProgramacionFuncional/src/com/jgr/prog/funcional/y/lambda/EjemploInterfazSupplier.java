package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploInterfazSupplier {

	//Supplier<T> tiene el metodo get,no recibe nada y devuelve un objeto
	//para extraccion de datos,como el generate de stream
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<> ();
		
		while(lista.size()<15) {
			
			lista.add(
					//no recibe nada y crea un array a partir del metodo
					Stream.generate(
							()->new Date()).toString());
					
			
		}
		
		
		lista.forEach(System.out::println);

	}

}
