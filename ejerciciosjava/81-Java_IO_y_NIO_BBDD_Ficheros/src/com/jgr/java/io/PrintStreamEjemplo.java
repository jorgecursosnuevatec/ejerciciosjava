package com.jgr.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * The Class PrintStream
 * de java.io
 * escritura con formato, sobreescribe y si no existe el fichero lo crea
 * System.out.println->estatico,contiene un PrintStream que apunta a la pantalla
 * PrintStream(String file)->se asocia a un fichero
 * PrintStream(OutputStream)->asociado a otra fuente para obtener datos
 * Escritura con formato
 * Graba los datos en modo sobrescritura
 * Si el fichero no existe se crea
 * 
 * 
 */
public class PrintStreamEjemplo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//escribe en directorio actual
		String ruta = "./PrintStreamEjemplo.txt";
		try(PrintStream salida = new PrintStream(ruta)){
			salida.println("escribiendo en salida PrintStream->" + PrintStream.class);
			System.out.println("escribiendo en salida PrintStream->" + salida.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		  //para leer con bufferedReader hay que crer un Reader intermedio, 
	    //que puede ser un InputStreamReader o un FileReader
		try(FileReader fileReader = new FileReader(ruta);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			var salida=bufferedReader.readLine();
			while(salida!=null) {
				System.out.println("SalidaPrintStreamEjemplo bufferedReader.getClass()->"+bufferedReader.getClass());				
				salida=bufferedReader.readLine();
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		//escrito con OutputStream
		String ruta2 = "./PrintStreamEjemplo2.txt";
		File file = new File(ruta2);
		String data ="Datos que va a escribir en el fichero de salida";
		 byte[] bytes = data.getBytes();
		    try (OutputStream out = new FileOutputStream(file)) {
		        out.write(bytes);
		    }
		    

			Path nombreArchivoPath = Path.of(ruta2);
			List<String> list = Files.readAllLines(nombreArchivoPath);
			list.forEach(s -> System.out.println("\n leyendo como lista->" + s));
		

	}

}
