package com.jgr.lambda.simples.interfaz.modelo;

public class Persona {
	
	private static int contador;
	private int numPersona;
	private String nombrePersona;
	
	public Persona() {
		this.numPersona=++contador;
	}
	
	public Persona(String nombrePersona) {
		this();
		this.nombrePersona = nombrePersona;
	}

	public int getNumPersona() {
		return numPersona;
	}

	public void setNumPersona(int numPersona) {
		this.numPersona = numPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	
	
	
	
	
	

}
