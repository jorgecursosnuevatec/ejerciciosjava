package com.jgr.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

/**
 * The Class PruebaLecturaBuffered.
 * para leer textos
 * para lectura de datos
 * las cadenas de caracteres se leen con ReadLine()
 * Para crearlo hace falta un Reader intermedio, BufferedReader(Reader reader), FileReader,InputStreamReader....
 * 
 * implementaciones
 * -InputStreamReader para leer teclado,o un fichero
 * -FileReader para leer fichero,lee todas las lineas del fichero. Si no existe provoca excepcion
 * 
 * 
 */
public class PruebaLecturaBuffered {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		String dir="./mydata.txt";
				
		try (FileOutputStream fos = new FileOutputStream(dir, true); PrintStream out = new PrintStream(fos)) {
			out.append("dir1");
			out.append("\ndir2");
			out.append("\ndir3");
			out.append(out.getClass().toString());
			out.println("\neste es println");			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
				
		//para leer con bufferedReader hay que crer un Reader intermedio, 
		//que puede ser un InputStreamReader o un FileReader
		try(FileReader fileReader = new FileReader(dir);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			var salida=bufferedReader.readLine();
			while(salida!=null) {
				System.out.println("Salida->"+salida);				
				salida=bufferedReader.readLine();
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		 //leo un InputStreamReader y lo paso a char		
		try(InputStream inputStream = new FileInputStream(dir);
				Reader inputStreamReader = new InputStreamReader(inputStream);) {
			int data = inputStreamReader.read();
			 System.out.println("Encoding de INputStream->"+((InputStreamReader) inputStreamReader).getEncoding() );
			while(data != -1){
			    char theChar = (char) data;
			    System.out.println("Dentro el INputStream->"+String.valueOf(theChar) );
			    data = inputStreamReader.read();			   
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {		
			e1.printStackTrace();
		}
		

		
		

	}

}
