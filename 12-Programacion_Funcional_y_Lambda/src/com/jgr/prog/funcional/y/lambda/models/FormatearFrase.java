/*
 * 
 */
package com.jgr.prog.funcional.y.lambda.models;


/**
 * The Interface FormatearFrase.
 * realmente no hace nada,es en el llamador principaleliminaespacios donde se define que es lo que hace 
 */
@FunctionalInterface
public interface FormatearFrase {
    
    /**
     * Limpiar yformatear.
     *
     * @param frase the frase
     * @return the string
     */
    String limpiarYformatear(String frase);

}