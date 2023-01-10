package com.jgr.anotaciones.repeteable;
/**
 * The Class LanzadoraRepeatingAnnotations.
 * Permite que una anotacion pueda aplicarse mas de una vez sobre un elemento
 * ademas de la anotacion principal se debe crear otra que incluya un array de objetos anotados
 * es una METANOTACION porque puede usarse para definir otras anotaciones
 * https://docs.oracle.com/javase/tutorial/java/annotations/repeating.html
 * https://www.javabrahman.com/java-8/java-8-repeating-annotations-tutorial/
 */
public class LanzadoraRepeatingAnnotations {
  	public static void main(String args[]) {
	   Color[] colorArray =
			   Shirt.class //declarado en Color
			   .getAnnotationsByType(Color.class);
	   for (Color color : colorArray) {
	    System.out.println(color.name());
	   }
	   
	   Color[] lista = Prueba.class //declarado en Color
			   .getAnnotationsByType(Color.class);
	   
	   for (Color color :lista) {
		   System.out.println("\n"+color.name());
		   
	   }
	   
	  }
	 }