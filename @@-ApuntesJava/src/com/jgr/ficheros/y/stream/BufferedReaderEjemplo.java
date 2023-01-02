package com.jgr.ficheros.y.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * The Class BufferedReader.
 * para lectura de datos
 * las cadenas de caracteres se leen con ReadLine()
 * Para crearlo hace falta un Reader intermedio, BufferedReader(Reader reader)
 * 
 * implementaciones
 * -InputStreamReader para leer teclado
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
		


	}

}
