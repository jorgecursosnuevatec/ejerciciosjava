package com.jgr.excepciones.lanza.personalizadas;

public class DivisionPorZeroException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5283291659613073926L;

	public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
