package com.jgr.clases.sealed.records;

import java.util.Objects;


/**
 * The  Person.
 * Usando registros, se genera para nosotros un constructor público, con un argumento para cada campo.
 * También recibimos métodos captadores públicos, cuyos nombres coinciden con el nombre de nuestro campo, 
 * de forma gratuita.
 * Además,  se genera un método equals para nosotros.
 * Similar a nuestro  método equals , también se genera para nosotros un método hashCode correspondiente  .
 * también recibimos un método toString que da como resultado una cadena que contiene el nombre del registro, 
 * seguido del nombre de cada campo y su valor correspondiente entre corchetes 
 * se puede hacer referencia a los campos mediante la  palabra clave this (por ejemplo, this.name y  this.address )
 * y los argumentos coinciden con los nombres de los campos (es decir, name y  address 
 */
public record Person (String name, String address) {
	
	  /** The unknown address. */
	//Declaramos variables estáticas usando la misma sintaxis que una clase:
  	public static String UNKNOWN_ADDRESS = "Unknown";
	  
  	/** The unnamed. */
  	public static String UNNAMED = "Unnamed";

	  /**
  	 * Instantiates a new person.
  	 * Esta personalización está destinada a ser utilizada para la validación y debe mantenerse 
  	 * lo más simple posible.
  	 * @param name the name
  	 * @param address the address
  	 */
  	public Person {
		    Objects.requireNonNull(name);
		    Objects.requireNonNull(address);
	  }
	
	  /**
  	 * Instantiates a new person.
  	 * 
  	 *
  	 * @param name the name
  	 */
  	public Person(String name) {
		    this(name, UNKNOWN_ADDRESS);
	  }
	
	  /**
  	 * Unnamed.
  	 *
  	 * @param address the address
  	 * @return the person
  	 */
  	public static Person unnamed(String address) {
		    return new Person(UNNAMED, address);
	  }
}