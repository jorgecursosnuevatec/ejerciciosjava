package com.jgr.paquete.stream.modelo;

import java.util.Objects;

	public class Alumno implements Comparable<Alumno>{
		private String nombre;
		private String apellidos;
		private Integer nota;
		public Alumno() {
		}

		public Alumno(String nombre,String apellidos, Integer nota) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.nota = nota;
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
			return Objects.hash(apellidos, nombre, nota);
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
			return Objects.equals(this.apellidos, other.apellidos) && Objects.equals(this.nombre, other.nombre)
					&& Objects.equals(this.nota, other.nota);
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Alumno [");
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
			}
			builder.append("]");
			return builder.toString();
		}

		@Override
		public int compareTo(Alumno o) {
			return this.nombre.compareTo(o.getNombre());
			//return 0;
		}

	
	}
