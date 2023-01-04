package com.jgr.bloques.texto;


/**
 * The Class BloquesTexto.
 * Contiene caracteres especiales como saltos de linea y comillas delimitando entre triples comillas
 * """-""" . Respeta comillas,saltos de linea...
 * 
 * 
 */
public class BloquesTexto {


	public static void main(String[] args) {
		String json="""
				{"nombre": "nombrecito",
				"telefonos":[111,2222,]				
				}				
				""";

		System.out.println("JSON->"+json);

	}

}
