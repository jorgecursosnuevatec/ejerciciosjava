package com.jgr.ejercicio.herencia;

import java.util.Date;
import java.util.Objects;

public class Cliente extends Persona {
	
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	
	private static int contador;

	public Cliente() {
		super();
		contador++;
	}
	
	private int sumaContador() {return contador++;}

	public Cliente(boolean vip) {
		this();
		this.vip = vip;
		this.fechaRegistro= new Date();
	
	}
	

	public Cliente(String nombre, char genero, int edad, String direccion, boolean vip) {
		super(nombre, genero, edad, direccion);
		this.vip = vip;
		this.idCliente=sumaContador();
	}
	public Cliente(Persona p, boolean vip) {
		super(p);
		this.vip = vip;
		this.idCliente=sumaContador();
	}
	

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return this.idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the fechaRegistro
	 */
	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	/**
	 * @return the vip
	 */
	public boolean isVip() {
		return this.vip;
	}

	/**
	 * @param vip the vip to set
	 */
	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fechaRegistro, idCliente, vip);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		return Objects.equals(this.fechaRegistro, other.fechaRegistro) && this.idCliente == other.idCliente
				&& this.vip == other.vip;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [idCliente=");
		builder.append(this.idCliente);
		builder.append(", ");
		if (this.fechaRegistro != null) {
			builder.append("fechaRegistro=");
			builder.append(this.fechaRegistro);
			builder.append(", ");
		}
		builder.append("vip=");
		builder.append(this.vip);
		builder.append(", ");
		if (super.toString() != null) {
			
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
