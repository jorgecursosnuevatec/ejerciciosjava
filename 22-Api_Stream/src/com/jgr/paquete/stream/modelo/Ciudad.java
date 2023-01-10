package com.jgr.paquete.stream.modelo;

import java.util.Objects;

public class Ciudad {
	
	private static int contadorCiudad;
	private int idCiudad;
	private String nomCiudad;
	private Double temperatura;
	
	public Ciudad() {
		super();
		idCiudad=++contadorCiudad;
	}

	public Ciudad(String nomCiudad, Double temperatura) {
		super();		
		this.nomCiudad = nomCiudad;
		this.temperatura = temperatura;
	}

	/**
	 * @return the idCiudad
	 */
	public int getIdCiudad() {
		return this.idCiudad;
	}

	/**
	 * @param idCiudad the idCiudad to set
	 */
	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	/**
	 * @return the nomCiudad
	 */
	public String getNomCiudad() {
		return this.nomCiudad;
	}

	/**
	 * @param nomCiudad the nomCiudad to set
	 */
	public void setNomCiudad(String nomCiudad) {
		this.nomCiudad = nomCiudad;
	}

	/**
	 * @return the temperatura
	 */
	public Double getTemperatura() {
		return this.temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCiudad, nomCiudad, temperatura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Ciudad)) {
			return false;
		}
		Ciudad other = (Ciudad) obj;
		return this.idCiudad == other.idCiudad && Objects.equals(this.nomCiudad, other.nomCiudad)
				&& Objects.equals(this.temperatura, other.temperatura);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ciudad [idCiudad=");
		builder.append(this.idCiudad);
		builder.append(", ");
		if (this.nomCiudad != null) {
			builder.append("nomCiudad=");
			builder.append(this.nomCiudad);
			builder.append(", ");
		}
		if (this.temperatura != null) {
			builder.append("temperatura=");
			builder.append(this.temperatura);
		}
		builder.append("]");
		return builder.toString();
	}
	
	

}
