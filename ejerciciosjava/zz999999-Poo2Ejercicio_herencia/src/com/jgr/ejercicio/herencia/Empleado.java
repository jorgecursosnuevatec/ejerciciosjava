package com.jgr.ejercicio.herencia;

public class Empleado extends Persona {
	private int idEmpleado;
	private double sueldo;
	
	private static int contador;
	
	public Empleado() {
		super();
		this.idEmpleado=sumaContador();	
	}	
	

	
	public Empleado(double sueldo) {
		this();		
		this.sueldo = sueldo;
	}

	
	public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
		super(nombre, genero, edad, direccion);				
		this.sueldo=sueldo;
		
	}
	public Empleado(Persona p, double sueldo) {
		super(p);		
		
		this.sueldo=sueldo;
		this.idEmpleado=sumaContador();
	}
	
	private int sumaContador() {return contador++;}
	
	

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return this.sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", ");
		if (super.toString() != null) {
			
			builder.append(super.toString());
		}
		builder.append("]");
		return builder.toString();
	}



}
