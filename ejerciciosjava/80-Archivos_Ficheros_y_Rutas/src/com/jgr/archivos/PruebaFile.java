package com.jgr.archivos;

import java.io.File;

/**
 * The Class PruebaFile.
 * File e la ruta a un fichero/directorio
* 
 * File->representa la ruta a un fichero o directorio
 * File file = new File("/user/myData.txt");
 * boolean exists()
 * boolean isFile();
 * boolean isDirectory();
 * boolean delete();
 * 
 */
public class PruebaFile {

	
	public static void main(String[] args) {
		
		String dir="/.mydata.txt";
		File ficheroFile = new File(dir);
		
		System.out.println("HashCode->"+ficheroFile.hashCode());
		System.out.println("Existe->"+ficheroFile.exists());
		System.out.println("Es fichero->"+ficheroFile.isFile());
		System.out.println("Es directorio->"+ficheroFile.isDirectory());
		System.out.println("Intenta borrarlo->"+ficheroFile.delete());
		
		
		
		
		

	}

}
