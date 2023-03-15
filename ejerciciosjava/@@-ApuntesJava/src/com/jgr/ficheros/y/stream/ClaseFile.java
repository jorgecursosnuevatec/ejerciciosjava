package com.jgr.ficheros.y.stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * The Class File.
 * java.io
 * representa una ruta a un fichero/directorio
 * -boolean exists()->true/false si existe
 * -boolean isFile()->true si es fichero
 * -boolean isDirectory()->true si es directorio
 * -boolean delete()->borra fichero/directorio. Si lo ha conseguido devuelve true
 */
public class ClaseFile {
	public static void main(String[] args) {
		
		File file = new File("./ClaseFile.txt");
		file.exists();
		file.delete();
		
		try(PrintStream salida = new PrintStream(file)){
			salida.println("escrito en ClaseFile");
			salida.println("escrito en ClaseFile2");
			salida.println("escrito en ClaseFile3");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//leyendo con BufferedReader y FileReader
		//lee todas las lineas,si no existe el fichero provoca excepcion		
		String salida="";
		try(FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr)){
			//mientras que lo que lea no sea nulo
			while((salida=br.readLine())!=null) {
				System.out.println("Leyendo fichero ClaseFile->"+salida);				
			}			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		

	}

}
