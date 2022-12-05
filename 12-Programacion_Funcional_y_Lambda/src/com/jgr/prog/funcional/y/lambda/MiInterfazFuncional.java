package com.jgr.prog.funcional.y.lambda;

import com.jgr.prog.funcional.y.lambda.models.Aritmetica;
import com.jgr.prog.funcional.y.lambda.models.Calculadora;

public class MiInterfazFuncional {

	public static void main(String[] args) {

		//defino lo que tiene que hacer el metodo sumar,restar,multiplicar y dividir
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;
        Aritmetica multiplica = (a,b)->a*b;

        Calculadora cal = new Calculadora();

        System.out.println("suma->"+cal.computar(10, 5, suma));
        System.out.println("resta->"+cal.computar(10, 5, resta));
        System.out.println("multi->"+cal.computar(10, 5, (a ,b) -> a * b));
        System.out.println("multiplica metodo->"+cal.computar(10, 5,multiplica));
        

        //en este caso la bifunction haria lo mismo
        //se le envian los dos numeros para hacer el calculo, y luego la funcion lambda
        System.out.println("suma bifunction->"+cal.computarConBiFunction(10, 5, (a, b) -> a+b));
        System.out.println("multiplica bifunction->"+cal.computarConBiFunction(10, 5, (a, b) -> a*b));


	}

}
