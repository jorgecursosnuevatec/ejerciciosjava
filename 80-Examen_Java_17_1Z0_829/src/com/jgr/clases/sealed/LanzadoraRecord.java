package com.jgr.clases.sealed;

import com.jgr.clases.sealed.records.Person;

/**
 * The Class LanzadoraRecord.
 * https://www.baeldung.com/java-record-keyword
 * https://www.youtube.com/watch?v=4i9ga5xJ72Y
 * A partir de JDK 14, podemos reemplazar nuestras clases de datos repetitivas con registros. 
 * Los registros son clases de datos inmutables que solo requieren el tipo y el nombre de los campos
 * El compilador de Java genera los métodos equals ,  hashCode y toString , así como los campos final y privado y el constructor  público 
 * 
 * Se usa sobre todo para DTO,su sentido es que no se modifiquen
 * 
 * 
 */
public class LanzadoraRecord {

	public static void main(String[] args) {
		
		Person persona = new Person("nombrecito","Direccioncita");
		
		System.out.println("Nombre->"+persona.name());
		System.out.println("HashCode->"+persona.hashCode());
		
		Person p2 = new Person("nombrecitoP2");
		System.out.println("NombreP2->"+p2.name());
		System.out.println("TodoP2->"+p2.toString());
		
		Person.unnamed("sin nombre");		
		System.out.println("Metodo unnamed->"+Person.unnamed("direccion,sin nombre"));
		
		
		
	}

}
