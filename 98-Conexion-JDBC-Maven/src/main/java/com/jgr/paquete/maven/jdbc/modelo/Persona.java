package main.java.com.jgr.paquete.maven.jdbc.modelo;



/**
 * The Class Persona.
 * CREATE TABLE `prueba`.`persona` (`id_persona` INT NOT NULL AUTO_INCREMENT , `nombre` VARCHAR(45) NULL DEFAULT NULL , `apellido` VARCHAR(45) NULL DEFAULT NULL , `email` VARCHAR(45) NULL DEFAULT NULL , `telefono` VARCHAR(45) NULL DEFAULT NULL , PRIMARY KEY (`id_persona`)) ENGINE = InnoDB; 
 */
public class Persona {
    
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

    /**
     * Instantiates a new persona.
     */
    public Persona() {
    }

    /**
     * Instantiates a new persona.
     *
     * @param idPersona the id persona
     */
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Instantiates a new persona.
     *
     * @param nombre the nombre
     * @param apellido the apellido
     * @param email the email
     * @param telefono the telefono
     */
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Instantiates a new persona.
     *
     * @param idPersona the id persona
     * @param nombre the nombre
     * @param apellido the apellido
     * @param email the email
     * @param telefono the telefono
     */
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    /**
     * Gets the id persona.
     *
     * @return the id persona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * Sets the id persona.
     *
     * @param idPersona the new id persona
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the apellido.
     *
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the apellido.
     *
     * @param apellido the new apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the telefono.
     *
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the telefono.
     *
     * @param telefono the new telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}
