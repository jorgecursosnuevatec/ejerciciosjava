package com.jgr.java.nio;

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
 * utiliza el juego de caracteres del tercero con las opciones del cuarto parametro
 * 
 * static Path	write​(Path path, Iterable<? extends CharSequence> lines, OpenOption... options)	
 * Write lines of text to a file.
 * escribe la cadena de caracteres del iterable
 *
 *ESCRIBIR
 *FileOutputStreamEjemplo fos = new FileOutputStreamEjemplo(String con la ruta,true)
 *PrintStream out = new PrintStream(fos);
 *LEER
 *FileReader fr = new FileReader(ruta);
 *BufferedReader br = new BufferedReader(fr);
 *
 *  
 */
public class ClaseFiles_escribir {

	public static void main(String[] args) {
		
		//static Path	writeString​(Path path, CharSequence csq, OpenOption... options) Write a CharSequence to a file.
		//escribe un string
		Path p1= Path.of("d:\\writeString.txt");
		try {
			Files.writeString(p1, "TEXTO A ESCRIBIR",
					Charset.forName("UTF-8"),
					StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Files.writeString(p1, "añade a lo ya escrito",
					Charset.forName("UTF-8"),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//static Path	write​(Path path, Iterable<? extends CharSequence> lines, OpenOption... options)
		//escribe un array
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

		
	}

}
