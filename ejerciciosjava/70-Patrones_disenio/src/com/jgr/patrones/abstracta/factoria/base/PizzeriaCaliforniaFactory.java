package com.jgr.patrones.abstracta.factoria.base;

import com.jgr.patrones.abstracta.factoria.modelos.PizzaCaliforniaPepperoni;
import com.jgr.patrones.abstracta.factoria.modelos.PizzaCaliforniaQueso;
import com.jgr.patrones.abstracta.factoria.modelos.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
