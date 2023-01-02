package com.jgr.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * The Class PrintStreamyFileOutputStream.
 * permite realiar la escritura en modo append
 */
public class PrintStreamyFileOutputStream {

	public static void main(String[] args) {
		String ruta = "./PrintStreamyFileOutputStream.txt";
		try(FileOutputStream fos = new FileOutputStream(ruta,true);
				PrintStream salida = new PrintStream(fos)){
			salida.println("escribiendo PrintStreamyFileOutputStream");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}


	}

}
