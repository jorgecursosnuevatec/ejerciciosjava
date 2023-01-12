package com.jgr.patrones.abstracta.factoria.base;

import com.jgr.patrones.abstracta.factoria.modelos.PizzaNewYorkItaliana;
import com.jgr.patrones.abstracta.factoria.modelos.PizzaNewYorkPepperoni;
import com.jgr.patrones.abstracta.factoria.modelos.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };
    }
}
