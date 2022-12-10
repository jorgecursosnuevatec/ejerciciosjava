package com.jgr.paquete.stream.modelo;

import java.util.Objects;

public class CajaNegraComparator {
	
	private static int contador;
	private int numCaja;
	
	
	public CajaNegraComparator() {
		++contador;
		numCaja=contador;
	}


	public CajaNegraComparator(int numCaja) {
		super();
		this.numCaja = numCaja;
	}


	/**
	 * @return the numCaja
	 */
	public int getNumCaja() {
		return this.numCaja;
	}


	/**
	 * @param numCaja the numCaja to set
	 */
	public void setNumCaja(int numCaja) {
		this.numCaja = numCaja;
	}


	@Override
	public int hashCode() {
		return Objects.hash(numCaja);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CajaNegraComparator)) {
			return false;
		}
		CajaNegraComparator other = (CajaNegraComparator) obj;
		return this.numCaja == other.numCaja;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CajaNegraComparator [numCaja=");
		builder.append(this.numCaja);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
