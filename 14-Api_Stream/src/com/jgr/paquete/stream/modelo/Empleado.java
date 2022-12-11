package com.jgr.paquete.stream.modelo;

import java.util.Objects;

public class Empleado {
	
	private int idEmpleado;
	private String nombre;
	private String departamento;
	private double salario;
	private static int contaEmpleados;
	public Empleado() {
		super();
		idEmpleado = ++contaEmpleados;
	}
	public Empleado(String nombre, String departamento, double salario) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.salario = salario;
	}
	/**
	 * @return the idEmpleado
	 */
	public int getIdEmpleado() {
		return this.idEmpleado;
	}
	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	 * @return the departamento
	 */
	public String getDepartamento() {
		return this.departamento;
	}
	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return this.salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public int hashCode() {
		return Objects.hash(departamento, idEmpleado, nombre, salario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Empleado)) {
			return false;
		}
		Empleado other = (Empleado) obj;
		return Objects.equals(this.departamento, other.departamento) && this.idEmpleado == other.idEmpleado
				&& Objects.equals(this.nombre, other.nombre)
				&& Double.doubleToLongBits(this.salario) == Double.doubleToLongBits(other.salario);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", ");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		if (this.departamento != null) {
			builder.append("departamento=");
			builder.append(this.departamento);
			builder.append(", ");
		}
		builder.append("salario=");
		builder.append(this.salario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
