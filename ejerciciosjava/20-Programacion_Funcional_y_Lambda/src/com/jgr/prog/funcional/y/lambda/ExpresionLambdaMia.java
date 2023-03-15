package com.jgr.prog.funcional.y.lambda;

import java.util.ArrayList;
import java.util.List;


/**
 * The Class ExpresionLambdaMia.
 */
public class ExpresionLambdaMia {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		// llama a la interfaz funcional
		// esta seria una expresion lambda,guardamos este metodo en una variable
		ExpresionLambdaInterfazUsadaMia ex = (a) -> System.out.println(a);
		
		//el metodo met en ExpresionLambdaInterfazUsadaMia ->void met(int data);
		ex.met(100);

		

	}

}
