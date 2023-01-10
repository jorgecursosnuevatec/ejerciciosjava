package com.jgr.anotaciones.excepciones;

/**
 * The Class JsonSerializadorException.
 */
public class JsonSerializadorException extends RuntimeException{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7379334419757611765L;

	/**
	 * Instantiates a new json serializador exception.
	 *
	 * @param message the message
	 */
	public JsonSerializadorException(String message) {
        super(message);
    }
}
