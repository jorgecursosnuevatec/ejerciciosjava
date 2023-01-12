package com.jgr.records;

// TODO: Auto-generated Javadoc
/**
 * The  Persona_Record.
 * para reducir la definicion de java bean
 * genera de forma automatica
 * atributos
 * constructor
 * metodos para recuperar valores(getter)
 * implementa toString y equals
 * es INMUTABLE cuando se crea
 * son finales,no pueden heredarse
 * no puede heredar ninguna clase
 * los atributos son inmutables
 * los atributos son finales,si se define el constructor se deben dar valores a todos los atributos
 */
public record Persona_Record(String nombre,String apellidos,int edad) {
	
	
	
	/**
	 * Constructor compacto,primero llama al canonico automaticamente
	 *
	 * @param nombre the nombre
	 * @param apellidos the apellidos
	 * @param edad the edad
	 */
	public Persona_Record {
		System.out.println("Dentro del constructor compacto antes de modificar la edad->"+nombre);		
		System.out.println("Dentro del constructor compacto antes de modificar la edad->"+apellidos);
		System.out.println("Dentro del constructor compacto antes de modificar la edad->"+edad);		
		System.out.println("\n");		
		edad=edad*2;
		
	}
	
	/**
	 * Sobrecarga de constructores,la primera sentencia debe ser llamar al canonico
	 *
	 * @param nombre the nombre
	 */
	public Persona_Record(String nombre) {
		
		this("nombre","apellidos",1);
		System.out.println("\nDentro del constructor sobrecargado despues de modificar nombre->"+nombre);
	}
	
}