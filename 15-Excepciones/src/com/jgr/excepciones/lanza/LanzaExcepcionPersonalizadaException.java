package com.jgr.excepciones.lanza;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.jgr.excepciones.lanza.personalizadas.ExcepcionPersonalizadaException;

// TODO: Auto-generated Javadoc
/**
 * The Class LanzaExcepcionPersonalizadaException.
 * Como la excepcion hereda de runtimeexception NO ES OBLIGATORIO poner el throws
 */
public class LanzaExcepcionPersonalizadaException {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ExcepcionPersonalizadaException the excepcion personalizada exception
	 */
	public static void main(String[] args) throws ExcepcionPersonalizadaException {

		double dividendo = 0;
		double divisor = 0;
		String datos = null;

		datos = JOptionPane.showInputDialog(null, "Mete el dividendo");

		try {
			
			dividendo= Double.parseDouble(datos);

		} catch (Exception e) {
			//le paso un mensaje y la excepcion
			throw new ExcepcionPersonalizadaException("Dividendo "+ datos +" no es un numero", e);
		}

		if (dividendo == 0) {
			throw new ExcepcionPersonalizadaException("Dividendo es cero");
		}
		
		datos = JOptionPane.showInputDialog(null, "Mete el divisor");
		
		try {
			
			divisor = Double.parseDouble(datos);
		
		
		} catch (NumberFormatException n) {
			throw new ExcepcionPersonalizadaException("Divisor "+ datos +" no es un numero",n);
		}
		
		if (divisor == 0) {
			throw new ExcepcionPersonalizadaException("Numerador es cero");
		}
		
		

		
		JOptionPane.showMessageDialog(null, "El resultado es "+ dividendo/divisor);
		
		System.exit(-1);

	}

}
