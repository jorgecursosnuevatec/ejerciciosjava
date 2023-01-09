package com.jgr.bloques.texto;


/**
 * The Class BloquesTexto.
 * 
 * Contiene caracteres especiales como saltos de linea y comillas delimitando entre triples comillas
 * """-""" . Respeta comillas,saltos de linea...
 * 
 * En multilinea los espacios antes del salto de linea se eliminan a menos que se ponga \s
 * 
 * si no queremos salto de linea hay que poner \,despues de ponerlo no se puede poner nada
 * 
 */
public class BloquesTexto {

	public static void main(String[] args) {
		
		//mantiene formato al estar entre triple comilla
		String json="""
				{"nombre": "nombrecito",
				"telefonos":[111,2222,]				
				}				
				""";

		System.out.println("JSON->"+json);
		
		//a+salto de linea 2
		//b+salto de linea 2
		//c+salto de linea + espacio + espacio +salto de linea
		json = """
				a                          
				b                                  
				c \s
				""";
		
		System.out.println("\ncadena->"+json);
		char[] c = json.toCharArray();		
		for(char carater:c) {
			byte[] utf = Character.toString(carater).getBytes();			
			System.out.println("caracter->"+carater+" byte->"+utf);				
		}
		System.out.println("longitud->"+json.length());
		
		
		//quitamos salto de linea
		//e+salto de linea 2
		//e 1
		//f +salto de linea 2
		json="""
				d \
				e\
				f
				""";

		System.out.println("\nSin salto de linea->"+json);
		
		c = json.toCharArray();		
		for(char carater:c) {
			byte[] utf = Character.toString(carater).getBytes();			
			System.out.println("caracter->"+carater+" byte->"+utf);			
		}
		System.out.println("Sin salto de linea->"+json.length());
		
		//r +salto de linea 2
		//espacio(el \s) 1,elimina salto de linea
		//salto de linea
		//se contaria r-salto de linea + espacio
		
		json ="""
				r
				\s\
				\
				""";
		
		System.out.println("\nvariable->"+json);
		System.out.println("variable longitud->"+json.length());
		
		String c1= "esto es texto";
		String c2 ="""
				esto es texto""";		
		String c3 = """
				esto es texto
				
				""";
		
		System.out.println("\nc1.equals(c2)->"+c1.equals(c2));
		System.out.println("c1.equals(c3)->"+c1.equals(c3));
		System.out.println("c2.equals(c3)->"+c2.equals(c3));
		System.out.println("c1.length()==c2.length()->"+(c1.length()==c2.length()));
		
		
		
		
	}

}
