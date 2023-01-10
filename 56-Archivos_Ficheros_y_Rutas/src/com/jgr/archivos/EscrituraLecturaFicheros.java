package com.jgr.archivos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class EscrituraFicheros.
 * 
 * static Path	writeString​(Path path, CharSequence csq, OpenOption... options) Write a CharSequence to a file.
 * escribe en el fichero la cadena especificada en el segundo,
 * utiliza eljuego de caracteres del tercero con las opciones del cuarto parametro
 * 
 * static Path	write​(Path path, Iterable<? extends CharSequence> lines, OpenOption... options)	
 * Write lines of text to a file.
 * escribe la cadena de caracteres del iterable
 *
 *ESCRIBIR
 *FileOutputStream fos = new FileOutputStream(String con la ruta,true)
 *PrintStream out = new PrintStream(fos);
 *LEER
 *FileReader fr = new FileReader(ruta);
 *BufferedReader br = new BufferedReader(fr);
 *
 *  
 */
public class EscrituraLecturaFicheros {

	public static void main(String[] args) {
		
		//static Path	writeString​(Path path, CharSequence csq, OpenOption... options) Write a CharSequence to a file.
		
		Path p1= Path.of("d:\\writeString.txt");
		try {
			Files.writeString(p1, "Files.writeString",
					Charset.forName("UTF-8"),
					StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//static Path	write​(Path path, Iterable<? extends CharSequence> lines, OpenOption... options)
        Path p2= Path.of("d:\\write​.txt");
		  List<String> miLista = new ArrayList<String>();
	        miLista.add("Lunes");
	        miLista.add("Martes");
	        miLista.add("Miercoles");
	        miLista.add("Jueves");
	        miLista.add("Viernes");	
	        miLista.add("PROBANDO CON UNA CADENA QUE SEGURO QUE TIENE MAS DE 10 CARACTERES PARA QUE FUNCIONE MAS ABAJO");
	        miLista.add("Martes");
	        miLista.add("Miercoles");
	        miLista.add("Jueves");
	        miLista.add("Viernes");	
	        try {
				Files.write(p2, miLista,
						Charset.forName("UTF-8"),
						StandardOpenOption.CREATE);
			} catch (IOException e) {
				e.printStackTrace();
			}

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
	        
	        //USANDO PRINTSTREAM
	        try(PrintStream out = new PrintStream(cadenaStringB)){
	        	out.println(cadenaStringB);
	        } catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}
	        
	        
	        //USANDO PRINTSTREAM Y FILEOUTPUTSTREAM
	        //PERMITE REALIZAR LA ESCRITURA CON/SIN AÑADIR A LO YA EXISTENTE
	        try {
				FileOutputStream fos = new FileOutputStream(cadenaStringB,true);
				PrintStream out = new PrintStream(cadenaStringB);
				out.println(cadenaStringB);
				
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
	        
	        		
				
	        
	}

}
