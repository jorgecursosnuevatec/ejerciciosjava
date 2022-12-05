package com.jgr.prog.funcional.y.lambda.models;
// TODO: Auto-generated Javadoc

/**
 * The Class Persona.
 */
public class Persona implements Comparable<Persona> {
	
	/** The nombre. */
	private String nombre;
	
	/** The edad. */
	private int edad;
	
	/**
	 * Instantiates a new persona.
	 */
	public Persona() {} 
	
	/**
	 * Instantiates a new persona.
	 *
	 * @param nombre the nombre
	 * @param edad the edad
	 */
	public Persona(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		builder.append("edad=");
		builder.append(this.edad);
		builder.append("]");
		return builder.toString();
	}
	// si objeto >parametro >0
	// si objeto==parametro 0
	/**
	 * Compare to.
	 *
	 * @param o the o
	 * @return the int
	 */
	// si objeto<parametro<0
	@Override
	public int compareTo(Persona o) {

		if (this.nombre.compareTo(o.getNombre()) == 0) {
			return ((Integer) this.edad).compareTo(o.getEdad());
		} else {
			return this.nombre.compareTo(o.getNombre());
		}

	}
	
	

}