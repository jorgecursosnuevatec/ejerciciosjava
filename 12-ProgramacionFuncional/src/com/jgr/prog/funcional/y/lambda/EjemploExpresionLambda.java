package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.List;

public class EjemploExpresionLambda {

	public static void main(String[] args) {

		// llama a la interfaz funcional
		// esta seria una expresion lambda,guardamos este metodo en una variable
		EjemploExpresionLambdaInterfazUsada ex = (a) -> System.out.println(a);
		
		//el metodo met en EjemploExpresionLambdaInterfazUsada ->void met(int data);
		ex.met(100);

		

	}

}
