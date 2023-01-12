package com.jgr.clases.sealed;


/**
 * The Class ClaseAClaseBClaseCLanzadora.
 * 
 * ClaseC no es sealed,pero hereda de ClaseB que si esta permitida en ClaseA
 * por lo que al ejecutar ClaseA lo que aparece es ClaseC, ya que hereda y ClaseC puede 
 * estar en un ClaseA 
 */
public class ClaseAClaseBClaseCLanzadora {
	public static void main(String[] args) {
		
		ClaseA cA = new ClaseC();
		cA.test();
		

	}

}
