package com.jgr.patron.decorador2.modelo.auxiliar;

import com.jgr.patron.decorador.comun.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
