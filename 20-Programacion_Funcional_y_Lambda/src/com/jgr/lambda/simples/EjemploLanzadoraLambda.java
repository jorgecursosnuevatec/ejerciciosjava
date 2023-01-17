package com.jgr.lambda.simples;

import com.jgr.lambda.simples.interfaz.modelo.InterfazI1;
import com.jgr.lambda.simples.interfaz.modelo.InterfazI2;
import com.jgr.lambda.simples.interfaz.modelo.InterfazI3;

/**
 * The Class EjemploLanzadoraLambda.
 * 
 * https://mkyong.com/tag/functional-interface/
 * 
 * 
 */
public class EjemploLanzadoraLambda {
	public static void main(String[] args) {
		
		//implementa la interfaz 1
		//void print (String cadena);
		InterfazI1 i1=cad->System.out.println(cad);
		i1.print("InterfazI1 Hola");
		
		
		//implementa la interfaz 2
		//la interfaz 2
		//int m(int a,int b);		
		InterfazI2 i2=(a,b)->a+b;
		System.out.println("Interfaz2->"+" "+(i2.m(1, 2)));
		
		//implementa la interfaz 3
		//String send();
		//como devuelve un resultado y es abstracta lo defino en la llamada
		InterfazI3 i3=()->" InterfazI3 String de retorno";
		
		//para llamar al metodo call que no es abstracto
		i3.call();
	}

}
