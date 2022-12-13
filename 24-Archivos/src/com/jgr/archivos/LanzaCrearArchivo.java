package com.jgr.archivos;

import com.jgr.archivos.auxiliar.ArchivoService;


/**
 * The Class LanzaCrearArchivo.
 * Ejecuta crear archivo usando ArchivoService
 */
public class LanzaCrearArchivo {
	public static void main(String[] args) {
		
		//las rutas con \\ DOBLE
		String nombreArchivoFileWriter= "d:\\archivosFileWriter.txt";
		String nombreArchivoBufferedWriter= "d:\\archivosBufferedWriter.txt";
		String nombreArchivoPrintWriter= "d:\\archivosPrintWriter.txt";
		ArchivoService archivoService = new ArchivoService();
		archivoService.crearYEscribirArchivoFileWriter(nombreArchivoFileWriter);
		archivoService.crearYEscribirArchivoBufferedWriter(nombreArchivoBufferedWriter," cadena a escribir ArchivoBufferedWriter");
		archivoService.crearYEscribirArchivoPrintWriter(nombreArchivoPrintWriter,
				" cadena a escribir ArchivoPrintWriter"," texto a sustituir por variable");
		
		
		System.out.println("Leer archivoBufferedReader" +
				archivoService.leerArchivoBufferedReader(nombreArchivoPrintWriter)
		);
		System.out.println("Leer archivoStringBuilder" +
				archivoService.leerArchivoStringBuilder(nombreArchivoBufferedWriter)
				);
		

	}

}
