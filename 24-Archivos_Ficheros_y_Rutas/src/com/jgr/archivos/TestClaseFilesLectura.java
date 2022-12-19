package com.jgr.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Class TestClaseFilesLectura.
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
public class TestClaseFilesLectura {
	public static void main(String[] args) throws IOException {

		
		// static Stream<String> lines​(Path path) Read all lines from a file as a Stream.
		String nombreArchivoFileWriter = "d:\\archivosBufferedWriter.txt";
		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(nombreArchivoFileWriter))) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();		}

		
		//static List<String>	readAllLines​(Path path)	Read all lines from a file.
		Path nombreArchivoPath = Path.of(nombreArchivoFileWriter);
		List<String> list = Files.readAllLines(nombreArchivoPath);
		list.forEach(s->System.out.println("\n leyendo como lista->"+s.toLowerCase()));
		

		//static BufferedReader	newBufferedReader​(Path path) Opens a file for reading,		
		BufferedReader entrada  = (BufferedReader) Path.of(nombreArchivoFileWriter);
		 var lectura = entrada.readLine();
         while(lectura != null){
             System.out.println("\nlectura BufferedReader= " + lectura.toUpperCase());
             lectura = entrada.readLine();
         }
         
		//USANDO BUFFERED READER Y FILEREADER
         //CON RECURSOS PORQUE LO CIERRA SOLO
         String dir="c:\\user\\myFile.txt";
         try(FileReader fr = new FileReader(dir)){
         BufferedReader br= new BufferedReader(fr);
         String linea;
         while((linea=br.readLine())!=null) {
        	 System.out.println("linea->"+linea);
        	 
         }
         }catch(IOException ex) {ex.getMessage();}
         
		
	}
}


