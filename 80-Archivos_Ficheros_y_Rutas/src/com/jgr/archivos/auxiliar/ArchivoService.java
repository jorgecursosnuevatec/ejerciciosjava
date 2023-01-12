package com.jgr.archivos.auxiliar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * The Class ArchivoService.
 * Utilidades para gestionar archivos
 */
public class ArchivoService {
	
	/**
	 * Crear Y escribir archivo file writer. cada vez que se le invoca va a escribir
	 *
	 * @param nombre the nombre
	 */
	public void crearYEscribirArchivoFileWriter(String nombre) {
		File archivo = new File(nombre);
		try {
			FileWriter escritor = new FileWriter(archivo);
			escritor.append("Primera parte del texto")
			.append(" esta SIN separar")
			.append("\n").append("\"\\n\"")
			.append(" es para que salte linea");
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear Y escribir archivo buffered writer. El buffered acumula y cuando se
	 * llena es cuando escribe
	 *
	 * @param nombre the nombre
	 * @param cadena the cadena
	 */
	public void crearYEscribirArchivoBufferedWriter(String nombre, String cadena) {
		File archivo = new File(nombre);
		// no hace falta el close porque la sentencia esta dentro del try,lo gestiona el
		// solo
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
			buffer.append(cadena).append("\n esta Linea esta dentro del metodo");
			// buffer.close();
			System.out.println("El archivo BufferedWriter se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Crear Y escribir archivo print writer.
	 * escribe como si fuera por consola,println,printf....
	 *
	 * @param nombre the nombre
	 * @param cadena the cadena
	 * @param textoSustituye the texto sustituye
	 */
	public void crearYEscribirArchivoPrintWriter(String nombre, String cadena,String textoSustituye) {
		File archivo = new File(nombre);
		// no hace falta el close porque la sentencia esta dentro del try,lo gestiona el
		// solo
		try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
			buffer.println(cadena);
			buffer.printf("ciao %s",textoSustituye);
			// buffer.close();
			System.out.println("El archivo PrintWriterWriter se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * Leer archivo buffered reader.
	 *
	 * @param nombre the nombre
	 * @return the string
	 */
	public String leerArchivoBufferedReader(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){

            String linea;
            while ( (linea = reader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
	
	/**
	 * Leer archivo string builder.
	 *
	 * @param nombre the nombre
	 * @return the string
	 */
	public String leerArchivoStringBuilder(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        
        try (Scanner s = new Scanner(archivo)){
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
