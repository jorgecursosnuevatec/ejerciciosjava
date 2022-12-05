package com.jgr.prog.funcional.y.lambda.models;

import java.util.function.BiFunction;

public class Calculadora {

    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a, b);
    }

//recibe dos numeros, y luego el bifunction recibiria los dos primeros double, el tercero seria el resultado y el
//ultimo parametro es una funcion lambda    
    	public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a, b);
    }
}
