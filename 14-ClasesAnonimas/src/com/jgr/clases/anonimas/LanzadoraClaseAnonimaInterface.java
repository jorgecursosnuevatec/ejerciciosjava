package com.jgr.clases.anonimas;
import com.jgr.clases.anonimas.modelo.*;


/**
 * The Class LanzadoraClaseAnonimaInterface.
 * Hacemos una funcion anonima con la interfaz IPrinter
 * sobreescribimos en el mismo punto lo que hace el metodo print
 */
public class LanzadoraClaseAnonimaInterface {
	
	
	public static void main(String[] args) {

		// COMO HACEMOS CON SPRING
		// IPrinter p = new PrinterImpl();
		// p.print("Hola caracola");

		// COMO CLASE ANONIMA USANDO DIRECTAMENTE LA INTERFACE
		IPrinter f = new IPrinter() {
			@Override
			public void print(String cad) {
				System.out.println("Ejecutando como clase anonima CON INTERFACE->" + cad);
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getName());
				System.out.println("Clase anonima INTERFACE->" +this.getClass().getAnnotatedInterfaces());
			}
		};

		f.print("Cadena desde main");
		
		//como objeto normal
		PrinterImpl pI = new PrinterImpl();		
		pI.print("Ejecutando como objeto");
		
		
	}

}
