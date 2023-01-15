package com.jgr.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

/**
 * The Class BufferedReader.
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
public class BufferedReaderEjemplo {
	public static void main(String[] args) {
		
		String ruta = "./CrearFicheroParaBufferedReader.txt";
		try(PrintStream salida = new PrintStream(ruta)){
			salida.println("escrito en el FicheroParaBufferedReader");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//leyendo con BufferedReader y FileReader
		//lee todas las lineas,si no existe el fichero provoca excepcion
		
		String salida="";
		try(FileReader fr = new FileReader(ruta);
				BufferedReader br = new BufferedReader(fr)){
			//mientras que lo que lea no sea nulo
			while((salida=br.readLine())!=null) {
				System.out.println("Leyendo fichero FicheroParaBufferedReader->"+salida);				
			}			
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		 //leo un InputStreamReader y lo paso a char		
		try(InputStream inputStream = new FileInputStream(ruta);
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
