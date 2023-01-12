package com.jgr.patron.decorador2.modelo.auxiliar;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador2.comun.Configurable;


abstract public class CafeDecorador implements Configurable {
    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
