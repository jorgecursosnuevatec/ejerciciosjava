package com.jgr.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The Class Java_IO_InputStream_FileInputStream_FileReader_BufferedReader_Leer.
 * InputStream->clase abstracta que representa un flujo de entrada de bytes
 * 
 * FileInputStream->subclase de InputStream que representa un flujo de entrada asociado a un fichero
 * 
 * FileReader->clase especifica para lectura de texto en fichero
 * 
 * BufferedReader->mas eficiente para lectura de cadenas de texto de fuente externa
 * 
 * https://www.youtube.com/watch?v=gqrRieAbHws
 */
public class Java_IO_InputStream_FileInputStream_FileReader_BufferedReader_Leer {

	public static void main(String[] args)  {
		
		
		String dirnn=".\\archivosprobarlectura.txt";		
		try(PrintStream outPrintStream= new PrintStream(dirnn)){
			outPrintStream.println("textoPrintStream");	
			System.out.println("printStream.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		
		
		//lectura usando BufferedReader
		//se debe crear un inputstreamreader asociadao a la entrada estandar system.in
		
		try(InputStreamReader isr= new InputStreamReader(System.in);
				BufferedReader br= new BufferedReader(isr);){
			System.out.println("Prueba InputStreamReader+BufferedReader,pulsa intro ");
			String nombre = br.readLine();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		//leyendo con Scanner
		//en java.util, con metodos para el resto de datos primitivos
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ahora con Scanner");
		
		
		//para el bufferedReader nos apoyamos en FileReader
		//si el fichero no existe se produce excepcion		
		try(FileReader fr = new FileReader(dirnn);
				BufferedReader br = new BufferedReader(fr);){
			String linea= "";
			while((linea=br.readLine())!=null) {
				System.out.println("\nSALIDA->"+linea);
			}
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
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
		
	}

}
