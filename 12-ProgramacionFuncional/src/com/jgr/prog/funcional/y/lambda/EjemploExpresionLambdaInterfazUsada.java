package com.jgr.prog.funcional.y.lambda;


//esta seria una interfaz funcional,solo tiene un metodo . El default no cuenta
public interface EjemploExpresionLambdaInterfazUsada {
	void met(int data);
	//esto indica que no es obligatorio que lo implemente el programa que la llama
	default int res() {return 1;}

}
