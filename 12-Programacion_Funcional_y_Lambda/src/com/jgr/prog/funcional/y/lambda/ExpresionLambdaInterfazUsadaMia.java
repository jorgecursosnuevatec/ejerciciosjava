package com.jgr.prog.funcional.y.lambda;


/**
 * The Interface ExpresionLambdaInterfazUsadaMia.
 */
//esta seria una interfaz funcional,solo tiene un metodo . El default no cuenta
public interface ExpresionLambdaInterfazUsadaMia {
	
	/**
	 * Met.
	 *
	 * @param data the data
	 */
	void met(int data);
	
	/**
	 * Res.
	 *
	 * @return the int
	 */
	//esto indica que no es obligatorio que lo implemente el programa que la llama
	default int res() {return 1;}

}
