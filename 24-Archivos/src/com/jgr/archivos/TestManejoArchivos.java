package com.jgr.archivos;

import com.jgr.archivos.auxiliar.ManejoArchivos;

public class TestManejoArchivos {
	   public static void main(String[] args) {
		   var nombreArchivo = "prueba.txt";
//	        crearArchivo(nombreArchivo);

		   ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde Java");
		   ManejoArchivos.anexarArchivo(nombreArchivo, "adios");
	    }
	}
