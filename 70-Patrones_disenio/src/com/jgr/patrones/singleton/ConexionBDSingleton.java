package com.jgr.patrones.singleton;



/**
 * The Class ConexionBDSingleton.
 * Solo hay una instancia, el constructor es privado y en el momento en que se llama a la instancia
 * se verifica si existe ya o no antes de construirla
 */
public class ConexionBDSingleton {

    /** The instancia. */
    private static ConexionBDSingleton instancia;

    /**
     * Instantiates a new conexion BD singleton.
     */
    private ConexionBDSingleton(){
        System.out.println("Conectandose algún motor de base de datos");
    }

    /**
     * Gets the instancia.
     *
     * @return the instancia
     */
    public static ConexionBDSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
