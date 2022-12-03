package com.jgr.excepciones.lanza;

import java.util.Scanner;

import com.jgr.excepciones.lanza.personalizadas.ExcepcionPersonalizadaRuntime;

/**
 * The Class LanzaExcepcionPersonalizadaException.
 * Como la excepcion hereda exception ES OBLIGATORIO poner el throws
 */
public class LanzaExcepcionPersonalizadaRuntime {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ExcepcionPersonalizadaException the excepcion personalizada exception
	 */
	public static void main(String[] args)  {

		int dividendo = 0;
		int divisor = 0;
		String datos = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dividendo=");

		
		//aqui el try/catch es OPCIONAL
		try {
			datos = sc.nextLine();
			dividendo = Integer.parseInt(datos);

		} catch (ExcepcionPersonalizadaRuntime e) {
			//le paso un mensaje y la excepcion
			throw new  ExcepcionPersonalizadaRuntime ("Dividendo "+ datos +" no es un numero", e);
		}
		finally {
			System.out.println("tratado el dividendo");
		}

		if (dividendo == 0) {
			throw new ExcepcionPersonalizadaRuntime("Dividendo es cero");
		}
		
		System.out.println("Introduce divisor=");
		
		try {
			datos = sc.nextLine();
			divisor = Integer.parseInt(datos);
			
		} catch (Exception n) {
			throw new ExcepcionPersonalizadaRuntime("Divisor "+ datos +" no es un numero",n);
		}
		
		if (divisor == 0) {
			throw new ExcepcionPersonalizadaRuntime("Numerador es cero");
		}
		
		
		System.out.println("Resultado->"+ dividendo/divisor);
		
		
		sc.close();
		System.exit(-1);

	}

}
