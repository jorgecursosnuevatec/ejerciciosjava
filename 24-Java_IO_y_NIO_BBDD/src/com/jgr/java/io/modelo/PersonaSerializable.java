package com.jgr.java.io.modelo;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PersonaSerializable.
 * CREATE TABLE `prueba`.`persona` (`id_persona` INT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(45) NULL DEFAULT NULL , `apellido` VARCHAR(45) NULL DEFAULT NULL , `email` VARCHAR(45) NULL DEFAULT NULL , `telefono` VARCHAR(45) NULL DEFAULT NULL , PRIMARY KEY (`id_persona`)) ENGINE = InnoDB; 
 */
public class PersonaSerializable implements Serializable{
    
    /**
	 * @return the contaPersona
	 */
	public static int getContaPersona() {
		return contaPersona;
	}

	/**
	 * @param contaPersona the contaPersona to set
	 */
	public static void setContaPersona(int contaPersona) {
		PersonaSerializable.contaPersona = contaPersona;
	}

	/** The id persona. */
    private int idPersona;
    
    /** The nombre. */
    private String nombre;
    
    /** The apellido. */
    private String apellido;
    
    /** The email. */
    private String email;
    
    /** The telefono. */
    private String telefono;
    
    /** The conta persona. */
    private transient static int contaPersona;

    /**
     * Instantiates a new persona.
     */
    public PersonaSerializable() {
    	this.idPersona=++contaPersona;
    }

	public PersonaSerializable(String nombre, String apellido, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}

	/**
	 * @return the idPersona
	 */
	public int getIdPersona() {
		return this.idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return this.apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return this.telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonaSerializable [idPersona=");
		builder.append(this.idPersona);
		builder.append(", ");
		if (this.nombre != null) {
			builder.append("nombre=");
			builder.append(this.nombre);
			builder.append(", ");
		}
		if (this.apellido != null) {
			builder.append("apellido=");
			builder.append(this.apellido);
			builder.append(", ");
		}
		if (this.email != null) {
			builder.append("email=");
			builder.append(this.email);
			builder.append(", ");
		}
		if (this.telefono != null) {
			builder.append("telefono=");
			builder.append(this.telefono);
		}
		builder.append("]");
		return builder.toString();
	}

	

   }
