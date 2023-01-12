package com.jgr.records;


/**
 * The  Curso.
 */
public record Curso(String nombre, int duracion) {
	
	/**
	 * Sobrecarga de constructores,lo primero que hay que hacer es llamar al canonico
	 *
	 * @param nombre the nombre
	 */
	public Curso(String nombre) {
		this(nombre,20);
	}

}
