package com.jgr.lambda.simples.interfaz.modelo;

import java.util.Collection;
import java.util.function.Supplier;


public class ImplementaSupplier {
	
	
	//le pasamos una lista y una funcion supplier que genera datos,pero no acepta parametros de entrada	
	public int sumaListaYObtieneValorExterno(Collection<Integer> lista, Supplier<Integer> data) {
		
		int suma=0;
		for (Integer n:lista) {
			suma+=n;			
		}
		//al acumulado le añadimos lo que obtenemos del get
		return suma+data.get();
		
	}
	
}
