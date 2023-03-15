package com.jgr.ejercicio.mundopc.modelos;

public class Raton extends DispositivoEntrada {

	private int idRaton;
	private static int contadorRatones;

	public Raton() {
		super();
		this.idRaton = sumaContador();

	}

	public Raton(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idRaton = sumaContador();

	}

	private int sumaContador() {
		return contadorRatones++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(this.idRaton);
		builder.append(", ");
		if (this.getTipoEntrada() != null) {
			builder.append("getTipoEntrada()=");
			builder.append(this.getTipoEntrada());
			builder.append(", ");
		}
		if (this.getMarca() != null) {
			builder.append("getMarca()=");
			builder.append(this.getMarca());
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
