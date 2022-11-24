package prueba;

import java.util.Objects;

public class Persona implements Cloneable {
	
	private int numero;
	private String nombre;
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int numero, String nombre) {
		super();
		this.numero = numero;
		this.nombre = nombre;
	}
	public Persona() {
		super();
	}
	public Persona(Persona p) {
		this.nombre=p.getNombre();
		this.numero=p.getNumero();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		return Objects.equals(this.nombre, other.nombre) && this.numero == other.numero;
	}
	
	
	
	

}
