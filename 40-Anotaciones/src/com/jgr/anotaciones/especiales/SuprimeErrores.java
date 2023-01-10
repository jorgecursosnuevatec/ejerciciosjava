package com.jgr.anotaciones.especiales;

import java.util.List;

/**
 * The Class SuprimeErrores.
 * 
 * @SuppressWarnings
 * elimina errores del codigo fuente
 * @Target ->en type,method,parameter,constructor,local_variable...
 * @Retention->SOURCE
 * Valores->unchecked para codigo inseguro,deprecation para codigo obsoleto,unused no usados
 * 
 * @Override
 * delante de un metodo de instancia para indicar que esta sobreescrito,lo usa el compilador
 * 
 * @Deprecated
 * una clase,atributo,metodo esta deprecated, utilizada en tiempo de ejecucion
 * 
 * @SafeVarargs
 * en metodos y constructores para indicar que el varargs no realiza operaciones inseguras
 * 
 */
public class SuprimeErrores {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		var c=10;

		Object ob = List.of(20,100);

		@SuppressWarnings({ "unused", "unchecked" })
		List<Integer> lista = (List<Integer>)ob;

	}

}
