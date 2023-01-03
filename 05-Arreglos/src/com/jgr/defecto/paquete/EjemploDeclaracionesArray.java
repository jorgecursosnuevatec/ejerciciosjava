package com.jgr.defecto.paquete;

public class EjemploDeclaracionesArray {

	public static void main(String[] args) {
		//Formas de inicializar un array <strong>uni</strong>dimensional

		String m[]= new String[]{"a","b"};

		String[]ma = new String[]{"a","b"};

		String[] mb = new String[]{"a","b"};
		// Creación de un objeto array con dos literales del StringPool.

		String m2[] = {"a","b"};
		// Creación de un objeto array con dos literales del StringPool.

		String[] m3 = {new String("a"), new String("b")};
		// Creación de un objeto array con objetos String.


		for(String a:m)System.out.println(a);
		for(String a:m2)System.out.println(a);
		for(String a:m3)System.out.println(a);

		System.out.println(m[0]==m2[0]); //true
		// Apuntan al mismo sitio, al StringPool del heap.

		System.out.println(m[0]==m3[0]); //false
		System.out.println(m2[0]==m3[0]); //false
		// m3[0] es un objeto del heap fuera del StringPool.

		String[] ej1= new String[]{};//ok

		//* No se puede esto:
		//String[] x = new String[2]{"5","3"}; // dar dimensión y valor a la vez. 
		//Es correcto también:
		String [] ars[] = new String[2][];

		int[] vals = new int[5]; //crea un obj array en el heap, los 5 valores int con valor 0.


		// Array bidimensional

		// Distintas formas válidas de crear un array bidimensional.
		int[][] n = { { 1, 2 }, { 3, 4 } }; // filas 1,2 y 3,4 por lo que
		// tendremos 2 columnas!
		Integer[] n2[] = { { 1, 2 }, { 3 } };//fila:1,2  y fila: 3
		Integer n3[][] = new Integer[2][2];// dos filas por dos columnas
		n3[0] = new Integer[] { 1, 2 }; // en la fila 0 mete 1 y 2
		n3[1] = new Integer[] { 3, 4 };

		for (int i[] : n) {
			//vuelca la fila en el array i[]
			//muestra posiciones 0 y 1 de la fila
			System.out.println(i[0] + "-" + i[1]);
		}

		for (Integer[] i : n2){
			int cols = i.length;
			for(int j=0; j< cols;j++)
				System.out.println(i[j]);
		}

		//Object puede ser un ArrayDeLoQueSea[]
		for (Object i : n3) {
			if (i instanceof Integer[]) {
				System.out.println(((Integer[]) i)[0] + "-"
						+ ((Integer[]) i)[1]);
			}
		}

	}   


}
