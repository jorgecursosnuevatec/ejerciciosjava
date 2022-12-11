package com.jgr.paquete.stream.modelo;

import java.util.Objects;

public class Persona {
	
	private String nombre;
	private int dni;
	public Persona() {
		super();
	}
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
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
	 * @return the dni
	 */
	public int getDni() {
		return this.dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre);
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
		return this.dni == other.dni && Objects.equals(this.nombre, other.nombre);
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
		builder.append("dni=");
		builder.append(this.dni);
		builder.append(", ");
		if (this.getNombre() != null) {
			builder.append("getNombre()=");
			builder.append(this.getNombre());
			builder.append(", ");
		}
		builder.append("getDni()=");
		builder.append(this.getDni());
		builder.append(", hashCode()=");
		builder.append(this.hashCode());
		builder.append(", ");
		if (this.getClass() != null) {
			builder.append("getClass()=");
			builder.append(this.getClass());
			builder.append(", ");
		}
		if (super.toString() != null) {
			builder.append("toString()=");
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}
	

}
