package com.jgr.ejercicio.mundopc.modelos;

public class Monitor {

	private int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;

	public Monitor() {
		this.idMonitor = sumaContador();

	}

	public Monitor(String marca, double tamanio) {
		super();
		this.marca = marca;
		this.tamanio = tamanio;
		this.idMonitor = sumaContador();
	}

	private int sumaContador() {
		return contadorMonitores++;
	}

	/**
	 * @return the idMonitor
	 */
	public int getIdMonitor() {
		return this.idMonitor;
	}

	/**
	 * @param idMonitor the idMonitor to set
	 */
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
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

	/**
	 * @return the tamanio
	 */
	public double getTamanio() {
		return this.tamanio;
	}

	/**
	 * @param tamanio the tamanio to set
	 */
	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

}
