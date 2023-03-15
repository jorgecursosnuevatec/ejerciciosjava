package com.jgr.java.nio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Class ClaseFiles_leer.
 * 
 * devuelve un stream con las lineas
 * static Stream<String> lines​(Path path) Read all lines from a file as a Stream.
 * 
 * devuelve una lista con las cadenas,cada elemento es una linea
 * static List<String>	readAllLines​(Path path)	Read all lines from a file.
 * Mas optimizado que el Stream
 * 
 * devuelve un buffered reader para leer normal
 * static BufferedReader	newBufferedReader​(Path path) Opens a file for reading, 
 * returning a BufferedReader to read text from the file in an efficient manner.
 * 
 * https://mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
 */
public class ClaseFiles_leer {
	public static void main(String[] args) throws IOException {

		
		String dirnn="d:\\archivosprobarlectura.txt";		
		try(PrintStream outPrintStream= new PrintStream(dirnn)){
			outPrintStream.println("textoPrintStream");	
			System.out.println("printStream.txt");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		
		
		// static Stream<String> lines​(Path path) Read all lines from a file as a Stream.
		String nombreArchivoFileWriter = "d:\\archivosBufferedWriter.txt";
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(nombreArchivoFileWriter))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();		}

		
		//static List<String>	readAllLines​(Path path)	Read all lines from a file as a List.
		Path nombreArchivoPath = Path.of(nombreArchivoFileWriter);
		List<String> list = Files.readAllLines(nombreArchivoPath);
		list.forEach(s->System.out.println("\n leyendo como lista->"+s.toLowerCase()));
		

		//static BufferedReader	newBufferedReader​(Path path) Opens a file for reading,		
		try(FileReader fr = new FileReader(dirnn);
				BufferedReader br = new BufferedReader(fr);){
			String linea= "";
			while((linea=br.readLine())!=null) {
				System.out.println("SALIDA->"+linea);
			}
			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
         
		//BufferedReader y 
         //CON RECURSOS PORQUE LO CIERRA SOLO
         String dir="d:\\archivos\\myFile.txt";
         try(FileReader fr = new FileReader(dir)){
         BufferedReader br= new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null) {
        	 System.out.println("linea->"+linea);        	 
         }
         }catch(IOException ex) {ex.getMessage();}
         
         
       //imprimen 	en fichero todo lo que tenga mas de 10 caracteres			
	        String cadenaString ="d:\\write​.txt";
	        try {
	        	 Path pt = Path.of(cadenaString);
				Files.lines(pt).filter(s->s.length()>10).forEach(System.out::println);
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	        //otra manera
	        String cadenaStringB ="d:\\write​.txt";
	        try {
	        	 Path pt = Path.of(cadenaStringB);
				Files.readAllLines(pt).stream().filter(s->s.length()>10).forEach(System.out::println);
			} catch (IOException e) {	
				e.printStackTrace();
			}
	        
		
	}
}


