package com.jgr.records;


/**
 * The Class Persona_Record_Lanzadora.
 * 
 * para reducir la definicion de java bean
 * genera de forma automatica
 * atributos
 * constructor
 * metodos para recuperar valores(como el getter)
 * implementa toString y equals
 * es INMUTABLE cuando se crea
 * son finales,no pueden heredarse
 * no puede heredar ninguna clase
 * los atributos son inmutables
 * los atributos son finales,si se define el constructor se deben dar valores a todos los atributos
 * solo puede tener constantes o atributos definidos en el constructor
 * 
 * hay un constructor llamado compacto que permite realizar validaciones y/o transformaciones de datos
 * que se ejecuta despues del canonico(por defecto) y NO lleva parentesis para los parametros
 * 
 * se permite sobrecarga de constructores,pero siempre deben llamar primero al canonico
 * 
 * pueden implementar una interfaz
 * 
 */
public class Persona_Record_Lanzadora {
	public static void main(String[] args) {
		Persona_Record p= new Persona_Record("pepe","perez",20);
		Persona_Record p2= new Persona_Record("pepe","perez",20);
	    System.out.println(p.edad());
	    System.out.println(p.nombre());
	    System.out.println(p.apellidos());
	    System.out.println(p.equals(p2));
	    System.out.println(p);
	    System.out.println(p.hashCode());
	   
	    Persona_Record p3= new Persona_Record("sobreescritura");
	    System.out.println(p3);

	}

}
