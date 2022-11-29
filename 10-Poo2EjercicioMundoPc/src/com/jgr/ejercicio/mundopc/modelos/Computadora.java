package com.jgr.ejercicio.mundopc.modelos;

import java.util.Objects;

public class Computadora {

	private int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;

	private static int contadorComputadoras;

	public Computadora() {

	}

	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		super();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	public Computadora(String nombre, Monitor monitor, DispositivoEntrada dispo1, DispositivoEntrada dispo2) {
		super();
		this.nombre = nombre;
		this.monitor = monitor;

		if (dispo1 instanceof Teclado) {
			this.teclado = (Teclado) dispo1;
		} else {
			if (dispo1 instanceof Raton) {
				this.raton = (Raton) dispo1;
			}
		}
		if (dispo2 instanceof Teclado) {
			this.teclado = (Teclado) dispo2;
		} else {
			if (dispo2 instanceof Raton) {
				this.raton = (Raton) dispo2;
			}
		}

	}

	/**
	 * @return the idComputadora
	 */
	public int getIdComputadora() {
		return this.idComputadora;
	}

	/**
	 * @param idComputadora the idComputadora to set
	 */
	public void setIdComputadora(int idComputadora) {
		this.idComputadora = idComputadora;
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
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return this.monitor;
	}

	/**
	 * @param monitor the monitor to set
	 */
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * @return the teclado
	 */
	public Teclado getTeclado() {
		return this.teclado;
	}

	/**
	 * @param teclado the teclado to set
	 */
	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	/**
	 * @return the raton
	 */
	public Raton getRaton() {
		return this.raton;
	}

	/**
	 * @param raton the raton to set
	 */
	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Computadora [");
		if (this.getNombre() != null) {
			builder.append("getNombre()=");
			builder.append(this.getNombre());
			builder.append(", ");
		}
		if (this.getMonitor() != null) {
			builder.append("getMonitor()=");
			builder.append(this.getMonitor());
			builder.append(", ");
		}
		if (this.getTeclado() != null) {
			builder.append("getTeclado()=");
			builder.append(this.getTeclado());
			builder.append(", ");
		}
		if (this.getRaton() != null) {
			builder.append("getRaton()=");
			builder.append(this.getRaton());
			builder.append(", ");
		}
		if (this.getClass() != null) {
			builder.append("getClass()=");
			builder.append(this.getClass());
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(idComputadora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Computadora)) {
			return false;
		}
		Computadora other = (Computadora) obj;
		return this.idComputadora == other.idComputadora;
	}

}
