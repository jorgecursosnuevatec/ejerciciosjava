package com.jgr.archivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class CopiarFicherosJava.
 * static Path	copy​(Path source, Path target, CopyOption... options)	
 *	Copy a file to a target file.
 *  si destino existe y no se indica opcion falle,si son iguales origen y destino no hace nada
 *  si origen es un directorio en target crea directorio vacio
 *  si destino es un directorio FileAlreadyExistsException
 *  
 *  static Path	move​(Path source, Path target, CopyOption... options)	
 * Move or rename a file to a target file.
 * 
 * static boolean	deleteIfExists​(Path path) Deletes a file if it exists.
 * static void	delete​(Path path) Deletes a file.
 * 
 */
public class CopiarFicherosJava {

	public static void main(String[] args) {

		Path origen = Path.of("./origen​.txt");
		Path intermedio = Path.of("./intermedio.txt");
		Path destino = Path.of("./destino.txt");
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
			Files.write(origen,
					miLista, Charset.forName("UTF-8"),
					StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//copia
		try {
			Files.copy(origen, intermedio,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		///mueve		
		try {
			Files.move(intermedio, destino,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
