package com.jgr.patron.decorador2.modelo.auxiliar;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador2.comun.Configurable;

public class ConLecheDecorador extends CafeDecorador{
    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Leche";
    }
}
