package com.jgr.prog.funcional.y.lambda;
class Persona implements Comparable<Persona> {
	private String nombre;
	private int edad;
	
	public Persona() {} 
	public Persona(String nombre,int edad) {
		this.nombre=nombre;
		this.edad=edad;
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
	 * @return the edad
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		builder.append("edad=");
		builder.append(this.edad);
		builder.append("]");
		return builder.toString();
	}
	// si objeto >parametro >0
	// si objeto==parametro 0
	// si objeto<parametro<0
	@Override
	public int compareTo(Persona o) {

		if (this.nombre.compareTo(o.getNombre()) == 0) {
			return ((Integer) this.edad).compareTo(o.getEdad());
		} else {
			return this.nombre.compareTo(o.getNombre());
		}

	}
	
	

}