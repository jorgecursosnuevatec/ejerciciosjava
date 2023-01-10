package com.jgr.patron.decorador2.modelo.auxiliar;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador2.comun.Configurable;

public class ConChocolateDecorador extends CafeDecorador{
    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes() + ", Chocolate";
    }
}
