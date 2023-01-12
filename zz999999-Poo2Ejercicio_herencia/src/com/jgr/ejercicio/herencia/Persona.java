package com.jgr.ejercicio.herencia;

import java.util.Objects;

public class Persona {
	private String nombre;
	private char genero;
	private int edad;
	private String direccion;
	
	public Persona() {
		super();
	}
	public Persona(Persona p) {
		this.nombre = p.getNombre();
		this.genero = p.getGenero();
		this.edad = p.getEdad();
		this.direccion = p.getDireccion();
	}

	public Persona(String nombre, char genero, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the genero
	 */
	public char getGenero() {
		return this.genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(char genero) {
		this.genero = genero;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, edad, genero, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		return Objects.equals(this.direccion, other.direccion) && this.edad == other.edad && this.genero == other.genero
				&& Objects.equals(this.nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		builder.append("genero=");
		builder.append(this.genero);
		builder.append(", edad=");
		builder.append(this.edad);
		builder.append(", ");
		if (this.direccion != null) {
			builder.append("direccion=");
			builder.append(this.direccion);
			
		}
		
		builder.append("]");
		return builder.toString();
	}

	
}
