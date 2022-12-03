package com.jgr.excepciones.lanza;

import java.util.Scanner;

import com.jgr.excepciones.lanza.personalizadas.ExcepcionPersonalizadaException;

// TODO: Auto-generated Javadoc
/**
 * The Class LanzaExcepcionPersonalizadaException.
 * Como la excepcion hereda de runtimeexception NO ES OBLIGATORIO poner el throws
 */
public class LanzaExcepcionPersonalizadaExceptionVentana {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ExcepcionPersonalizadaException the excepcion personalizada exception
	 */
	public static void main(String[] args) throws ExcepcionPersonalizadaException {

		int dividendo = 0;
		int divisor = 0;
		String datos = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dividendo=");

		try {
			datos = sc.nextLine();
			dividendo = Integer.parseInt(datos);

		} catch (Exception e) {
			//le paso un mensaje y la excepcion
			throw new ExcepcionPersonalizadaException("Dividendo "+ datos +" no es un numero", e);
		}

		if (dividendo == 0) {
			throw new ExcepcionPersonalizadaException("Dividendo es cero");
		}
		
		System.out.println("Introduce divisor=");
		
		try {
			datos = sc.nextLine();
			divisor = Integer.parseInt(datos);
		
		
		} catch (NumberFormatException n) {
			throw new ExcepcionPersonalizadaException("Divisor "+ datos +" no es un numero",n);
		}
		
		if (divisor == 0) {
			throw new ExcepcionPersonalizadaException("Numerador es cero");
		}
		
		
		System.out.println("Resultado->"+ dividendo/divisor);
		
		
		sc.close();
		System.exit(-1);

	}

}
