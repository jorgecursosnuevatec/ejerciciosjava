package com.jgr.excepciones.lanza;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * The Class A_TeoriaCapturaExcepciones.
 * TODAS HEREDAN DE Throwable->Exception
 * 
 * 
 * CHECKED 
 * IoException,SqlException... excepciones propias de API'S,el compilador obliga a capturarlas 
 * 
 * UNCHECKED
 * heredan de RuntimeException,en tiempo de ejecucion NO es obligatorio capturarlas
 * tambien se les llama Java System Exception
 * ArrayIndexOutOfBoundsException->acceder fuera del limite de un array
 * NullPointerException->acceder a metodos de un objeto que referencia a ull
 * SecurityException->violacion de seguridad
 * ClassCastException->error en conversion de tipos
 * ArithmeticException->operacion matematica incorrecta(ojo que int/0 SI da error,
 * pero double/0.0 NO double r=3/0.0 NO DA ERROR)
 * IllegalArgumentException->el parametro de un metodo tiene un valor incorrecto
 * 
 * ERRORES
 * NO SON EXCEPCIONES,acaban en Error y 
 * una situacion de la que no se puede recuperar,fallo de memoria en JVM, falta de espacio....
 * los errores que heredan OutOfMemoryError,StackOverFlowError,InternalError
 * 
 * LAS EXCEPCIONES DEL MULTICATCH NO PUEDEN TENER RELACION DE HERENCIA,DA ERROR DE COMPILACION
 * EN CASO DE EXCEPCION NO CONTROLADA SI HAY FINALLY EJECUTA PRIMERO ESTO Y LUEGO SE PROPAGA LA EXCEPCION
 * 
 * String getMessage()->devuelve string con msg
 * void printStackTrace()->volcado de error enviado a consola
 * 
 */
public class A_TeoriaCapturaExcepciones {
	public static void main(String[] args) {


		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String fechaString="11/11/2022";
		String fechaStringError="11/99/2022";
		Date miFecha2=null;
		try {
			//			Date miFecha = format1.parse(fechaString);	
			miFecha2 = format1.parse(fechaStringError);	

		}

		catch ( ParseException ex) {
			System.out.println("error al convertir");
		}
		System.out.println("miFecha->"+miFecha2);


		//captura try-catch-finally

		String printStreamruta = "c:\\ficheros\\dias.txt";
		PrintStream salida =null;		
		//con PrintStream
		try{
			salida = new PrintStream(printStreamruta);
			salida.println("printStreamruta1");
			salida.print("printStreamruta2");
			salida.println("printStreamruta3");
			salida.println(false);


		}catch(FileNotFoundException f) {
			System.out.println("f.getStackTrace()->"+f.getStackTrace());			
			f.printStackTrace();			
			System.out.println("No existe el fichero");			
		}
		finally{ salida.close();}


		//try con recursos
		String printStreamruta2 = "c:\\ficheros\\dias2.txt";			
		//con PrintStream
		try(PrintStream salida2 = new PrintStream(printStreamruta2)){

			salida2.println("printStreamruta21");
			salida2.print("printStreamruta22");
			salida2.println("printStreamruta23");
			salida2.println(true);


		}catch(FileNotFoundException f) {
			System.out.println("f.getStackTrace()->"+f.getStackTrace());			
			f.printStackTrace();			
			System.out.println("No existe el fichero");			
		}


	}

}
