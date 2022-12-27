package com.jgr.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * The Class ClaseFile.
 * 
 * File->representa la ruta a un fichero o directorio
 * File file = new File("/user/myData.txt");
 * boolean exists()
 * boolean isFile();
 * boolean isDirectory();
 * boolean delete();
 * 
 * 
 */
public class ClaseFile {

	
	public static void main(String[] args) {
		
		//para que exista y podamos leerla
		String dirnn="d:\\archivosprobarlectura.txt";		
		try(PrintStream outPrintStream= new PrintStream(dirnn)){
			outPrintStream.println("textoPrintStream");	
			outPrintStream.println("textoPrintStream2");	
			outPrintStream.println("textoPrintStream3");	
			outPrintStream.println("textoPrintStream4");	
		//	System.out.println("printStream.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		
		//lectura Bytes con FileInputStream para ficheros binarios
		File file = new File(dirnn);		
		try(FileInputStream fis = new FileInputStream(file)){
			byte[] bytesSalida = new byte[(int) file.length()];			
			System.out.println("\nFileInputStream BYTES->"+ fis.read(bytesSalida));			

		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}

		String dirnn2="d:\\archivosprobarlectura.txt";	
		File file2 = new File(dirnn2);

		System.out.println("Existe fichero->"+file.exists());
		System.out.println("Es fichero->"+file.isFile());
		System.out.println("Es directorio->"+file.isDirectory());
		System.out.println("Lo borro->"+file2.delete());


				

	}

}
