package com.jgr.excepciones.lanza.personalizadas;

public class ExcepcionPersonalizadaRuntime extends RuntimeException{
	
	
	//propagamos mensaje a la clase padre
	public ExcepcionPersonalizadaRuntime(String mensaje,Exception e) {
		super(mensaje);
		e.printStackTrace();
		e.getMessage();
		e.toString();
		
	}
	
	
	public ExcepcionPersonalizadaRuntime(String mensaje) {
		super(mensaje);
		
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
