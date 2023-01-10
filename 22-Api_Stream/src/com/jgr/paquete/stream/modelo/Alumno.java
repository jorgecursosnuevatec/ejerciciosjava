package com.jgr.paquete.stream.modelo;

import java.util.Objects;

public class Alumno {
	
	private Integer idAlumno; 
	private String nombre;
	private String apellidos;
	private Integer nota;
	private static int contador;
	public Alumno() {
		this.idAlumno=++contador;
	}

	public Alumno(String nombre,String apellidos, Integer nota) {
		this();	
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nota = nota;
		
	}

	/**
	 * @return the idAlumno
	 */
	public Integer getIdAlumno() {
		return this.idAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the nota
	 */
	public Integer getNota() {
		return this.nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(Integer nota) {
		this.nota = nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, idAlumno, nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Alumno)) {
			return false;
		}
		Alumno other = (Alumno) obj;
		return Objects.equals(this.apellidos, other.apellidos) && Objects.equals(this.idAlumno, other.idAlumno)
				&& Objects.equals(this.nombre, other.nombre) && Objects.equals(this.nota, other.nota);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [");
		if (this.idAlumno != null) {
			builder.append("idAlumno=");
			builder.append(this.idAlumno);
			builder.append(", ");
		}
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		if (this.apellidos != null) {
			builder.append("apellidos=");
			builder.append(this.apellidos);
			builder.append(", ");
		}
		if (this.nota != null) {
			builder.append("nota=");
			builder.append(this.nota);
			builder.append(", ");
		}
		if (this.getIdAlumno() != null) {
			builder.append("getIdAlumno()=");
			builder.append(this.getIdAlumno());
			builder.append(", ");
		}
		if (this.getNombre() != null) {
			builder.append("getNombre()=");
			builder.append(this.getNombre());
			builder.append(", ");
		}
		if (this.getApellidos() != null) {
			builder.append("getApellidos()=");
			builder.append(this.getApellidos());
			builder.append(", ");
		}
		if (this.getNota() != null) {
			builder.append("getNota()=");
			builder.append(this.getNota());
			builder.append(", ");
		}
		builder.append("hashCode()=");
		builder.append(this.hashCode());
		builder.append(", ");
		if (this.getClass() != null) {
			builder.append("getClass()=");
			builder.append(this.getClass());
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
