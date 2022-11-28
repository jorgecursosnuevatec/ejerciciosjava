package com.jgr.ejercicio.mundopc.modelos;

import java.util.Objects;

public class DispositivoEntrada {
	
	private String tipoEntrada;
	private String marca;
	
	
	public DispositivoEntrada() {
		super();
	}

	public DispositivoEntrada(String tipoEntrada, String marca) {
		super();
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}

	/**
	 * @return the tipoEntrada
	 */
	public String getTipoEntrada() {
		return this.tipoEntrada;
	}

	/**
	 * @param tipoEntrada the tipoEntrada to set
	 */
	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, tipoEntrada);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DispositivoEntrada)) {
			return false;
		}
		DispositivoEntrada other = (DispositivoEntrada) obj;
		return Objects.equals(this.marca, other.marca) && Objects.equals(this.tipoEntrada, other.tipoEntrada);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DispositivoEntrada [");
		if (this.tipoEntrada != null) {
			builder.append("tipoEntrada=");
			builder.append(this.tipoEntrada);
			builder.append(", ");
		}
		if (this.marca != null) {
			builder.append("marca=");
			builder.append(this.marca);
		}
		builder.append("]");
		return builder.toString();
	}

	
	

}
