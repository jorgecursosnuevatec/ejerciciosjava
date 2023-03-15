package com.jgr.defecto.paquete;

import java.util.Arrays;

public class EjemploBusquedaBinariaArrays {

	//int binarySearch(tipo[] array,tipo valor). Devuelve donde está, tiene que estar ordenado
	//si no esta ordenado,resultado impredecible,pero no devuelve error
	//si existe devuelve su posicion, si no lo encuentra devuelve -posicion donde deberia estar -1
	 
	public static void main(String[] args) {
	
		int[] a1= {3,5,7,9,15,20};
		System.out.println(Arrays.binarySearch(a1, 9));//->devuelve 3
		System.out.println(Arrays.binarySearch(a1, 10));//->devuelve -5 donde deberia estar
		
	}

}
