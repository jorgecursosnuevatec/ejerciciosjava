package com.jgr.genericos;

public class ClaseGenericaFacil<T> {

	private T objeto;

	public ClaseGenericaFacil(T objeto) {
		this.objeto = objeto;
	}
	
	 public void obtenerTipo(){
	        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
	    }

}
