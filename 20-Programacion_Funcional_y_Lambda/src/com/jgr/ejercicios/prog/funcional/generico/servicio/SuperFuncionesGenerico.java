package com.jgr.ejercicios.prog.funcional.generico.servicio;
import java.util.ArrayList;
import java.util.List;

import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.ConsumidorGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.FuncionGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.OperadorBinarioGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.PredicadoGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.ProveedorGenerico;


/**
 * The Class SuperFuncionesGenerico.
 * Clase generica que contiene los metodos que vamos a usar,
 * igual que las anteriores pero el tipo de DATO que va a usar es GENERICO

 */
public class SuperFuncionesGenerico {
	
	/**
	 * Filtrar.
	 * realiza el filtrado segun sea true o false,recibe un predicate
	 * es un PREDICATE,solo tiene el metodo test, realiza la comprobacion y devuelve el boolean
	 * @param lista the lista
	 * @param predicado the predicado
	 * @return the list
	 */
	public static <T>List<T> filtrar(List<T> lista, PredicadoGenerico<T> predicado){
		
		List<T> resultado = new ArrayList<T>();
		
		for(T valor:lista) {
			if (predicado.test(valor))
			{resultado.add(valor);}
		}
		return resultado;		
	}
	
	/**
	 * Proveer.
	 * este seria un SUPPLIER, no recibe nada y devuelve algo	 *
	 * @param cuantos the cuantos
	 * @param proveedor the proveedor
	 * @return the list
	 */
	public static <T>List<T> proveer(int cuantos,ProveedorGenerico<T> proveedor){
		
		List<T> resultado = new ArrayList<T>();
		
		for (int i=0;i<cuantos;i++) {
			resultado.add(proveedor.obtener());		
		}
		return resultado;
	}
	
	/**
	 * Transformar.
	 * este seria un FUNCTION,recibe un valor hace algo y lo devuelve
	 * @param lista the lista
	 * @param funcion the funcion
	 * @return the list
	 * T->tipo de entrada
	 * R->tipo de salida
	 */
	public static <T,R>List<R> transformar(List<T> lista,FuncionGenerico<T,R> funcion){
		
		List<R> resultado = new ArrayList<R>();
		
		for(T valor:lista) {			
			resultado.add(funcion.aplicar(valor));
		}		
		
		return resultado;
	}
	
	/**
	 * Actuar sobre lista.
	 * Es un CONSUMER, hace algo con los valores, pero no devuelve nada
	 *
	 * @param lista the lista
	 * @param consumidor the consumidor
	 * @return the list
	 */
	public static <T>List<T> actuarSobreLista(List<T> lista,ConsumidorGenerico<T> consumidor){
		
		for(T valor:lista) {
			consumidor.aceptar(valor);			
		}
		return lista;		
	}
	
	/**
	 * Actuar sobre lista.
	 * Es un CONSUMER, hace algo con los valores, pero no devuelve nada
	 * @param lista the lista
	 * @param consumidor the consumidor
	 * @return the list
	 */
	public static <T> void consumirLista(List<T> lista,ConsumidorGenerico<T> consumidor){
		
		for(T valor:lista) {
			consumidor.aceptar(valor);			
		}
	}
	
	
	/**
	 * Reducimos valores de un tipo y lo acumulamos en un acumulador.
	 * @param lista the lista
	 * @param identidad the identidad
	 * @param ahora recibimos un operador binario,tambien generico 
	 * @return 
	 * @return 
	 * @return the T
	 */
	public static <T>  T reduciryAcumular(List<T> lista,T acumulador ,OperadorBinarioGenerico<T> operadorGenerico) {
		
		T total=acumulador;
		for(T numero:lista) {
			total=operadorGenerico.aplicar(total,numero);			
		}
		return total;
		
		
	}
	
}
