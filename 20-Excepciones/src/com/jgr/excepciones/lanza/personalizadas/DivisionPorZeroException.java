package com.jgr.excepciones.lanza.personalizadas;

public class DivisionPorZeroException extends Exception {
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
