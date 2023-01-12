package com.jgr.peliculas.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula{
	private int idPelicula;
	private static int contaPelicula;
	String nombre;

	public Pelicula() {
		super();
		idPelicula = ++contaPelicula;
	}

	public Pelicula(String nombre) {
		this();
		this.nombre = nombre;
	}

	/**
	 * @return the idPelicula
	 */
	public int getIdPelicula() {
		return this.idPelicula;
	}

	/**
	 * @param idPelicula the idPelicula to set
	 */
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
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

	@Override
	public int hashCode() {
		return Objects.hash(idPelicula, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pelicula)) {
			return false;
		}
		Pelicula other = (Pelicula) obj;
		return this.idPelicula == other.idPelicula && Objects.equals(this.nombre, other.nombre);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pelicula [idPelicula=");
		builder.append(this.idPelicula);
		builder.append(", ");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
		}
		builder.append("]");
		return builder.toString();
	}

}
