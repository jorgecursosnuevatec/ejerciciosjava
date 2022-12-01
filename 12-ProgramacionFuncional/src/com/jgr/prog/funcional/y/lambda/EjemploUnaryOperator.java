package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploUnaryOperator {

	//subinterfaz de function, el tipo de entrada coincide con el de salida
	//como function,para transformar datos
	

	public static void main(String[] args) {
		int[] a1= {3,5,7,9,15,20};
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i=0;i<a1.length;i++) {
			
			lista.add(a1[i]);			
		}
		
		lista.forEach(System.out::println);
		//se la recorre entera y lo multiplica por si misma
		lista.replaceAll(n->Integer.valueOf(n)*Integer.valueOf(n));

		
		lista.forEach(System.out::println);

	}

}
