package com.jgr.ficheros.y.stream;

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
 * Para crearlo hace falta un Reader intermedio, BufferedReader(Reader reader)
 * 
 * implementaciones
 * -InputStreamReader para leer teclado
 * -FileReader para leer fichero,lee todas las lineas del fichero. Si no existe provoca excepcion
 */
public class BufferedReaderYFileReader {
	public static void main(String[] args) {
		
		
		//solo para que exista el fichero de salida con datos
		String ruta = "./CrearFicheroParaBufferedReader.txt";
		try(PrintStream salida = new PrintStream(ruta)){
			salida.println("escrito en el FicheroParaBufferedReader");
			salida.println("\n escribiendo despues de salto de linea");
			salida.println("\t escribiendo despues de salto de parrafo");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		//leyendo con BufferedReader y FileReader
		//lee por linea ,si no existe el fichero provoca excepcion		
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
		
	
		 
		//LEYENDO CON UN INPUTSTREAM
		try(InputStream inputStream = new FileInputStream(ruta);
				Reader   inputStreamReader = new InputStreamReader(inputStream);) {
			int data = inputStreamReader.read();
			 System.out.println("Enconding de INputStream->"+((InputStreamReader) inputStreamReader).getEncoding() );
			while(data != -1){
			    char theChar = (char) data;
			    System.out.println("Dentro del INputStream->"+String.valueOf(theChar) );
			    data = inputStreamReader.read();			   
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {		
			e1.printStackTrace();
		}
		


	}

}
