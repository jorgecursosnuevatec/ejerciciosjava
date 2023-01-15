package com.jgr.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;


/**
 * The Class FileOutputStreamEjemplo.
 * permite realizar la escritura en modo append
 * creamos el FileOutputStream con la ruta y el indicador de si añade o sobreescribe como 
 * parametro de un PrintStream
 * https://www.baeldung.com/java-outputstream
 */
public class FileOutputStreamEjemplo {

	public static void main(String[] args) {
		String ruta = "./FileOutputStreamEjemplo.txt";
		try(FileOutputStream fos = new FileOutputStream(ruta,true);
				PrintStream salida = new PrintStream(fos)){
			salida.println("escribiendo FileOutputStreamEjemplo");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {			
			e1.printStackTrace();
		}


	}

}
