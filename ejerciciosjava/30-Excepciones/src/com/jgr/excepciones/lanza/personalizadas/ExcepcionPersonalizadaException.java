package com.jgr.excepciones.lanza.personalizadas;

public class ExcepcionPersonalizadaException extends Exception {

	// propagamos mensaje a la clase padre
	public ExcepcionPersonalizadaException(String mensaje, Exception e) {
		super(mensaje);
		e.printStackTrace();
		e.getMessage();
	}

	public ExcepcionPersonalizadaException(String mensaje) {
		super(mensaje);

	}
	private static final long serialVersionUID = 1L;

}
