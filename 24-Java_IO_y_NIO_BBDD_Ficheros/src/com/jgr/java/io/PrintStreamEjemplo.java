package com.jgr.java.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * The Class PrintStream
 * de java.nio
 * escritura con formato, sobreescribe y si no existe el fichero lo crea
 * System.out.println->estatico,contiene un PrintStream que apunta a la pantalla
 * PrintStream(String file)->se asocia a un fichero
 * PrintStream(OutputStream)->asociado a otra fuente para obtener datos
 * 
 */
public class PrintStreamEjemplo {

	public static void main(String[] args) {
		
		//escribe en directorio actual

		String ruta = "./PrintStreamEjemplo.txt";
		try(PrintStream salida = new PrintStream(ruta)){
			salida.println("escribiendo en salida");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		

	}

}
