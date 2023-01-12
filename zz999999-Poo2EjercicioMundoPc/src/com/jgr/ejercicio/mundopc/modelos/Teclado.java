package com.jgr.ejercicio.mundopc.modelos;

public class Teclado extends DispositivoEntrada {

	private int idTeclado;
	private static int contadorTeclados;

	public Teclado() {
		super();
		this.idTeclado = sumaContador();

	}

	public Teclado(String tipoEntrada, String marca) {
		super(tipoEntrada, marca);
		this.idTeclado = sumaContador();
	}

	private int sumaContador() {
		return contadorTeclados++;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTeclado=");
		builder.append(this.idTeclado);
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
