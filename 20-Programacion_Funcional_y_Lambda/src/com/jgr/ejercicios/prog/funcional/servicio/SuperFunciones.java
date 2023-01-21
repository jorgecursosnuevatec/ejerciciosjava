package com.jgr.ejercicios.prog.funcional.servicio;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.*;

import java.util.ArrayList;
import java.util.List;




// TODO: Auto-generated Javadoc
/**
 * The Class SuperFunciones.
 * Clase generica que contiene los metodos que vamos a usar,
 */
public class SuperFunciones {
	
	
	/** The resultado. */
	private static List<Integer> resultado;
	
	/**
	 * Filtrar.
	 * realiza el filtrado segun sea true o false,recibe un predicate
	 * es un PREDICATE,solo tiene el metodo test, realiza la comprobacion y devuelve el boolean
	 * @param lista the lista
	 * @param predicado the predicado
	 * @return the list
	 */
	public static List<Integer> filtrar(List<Integer> lista, Predicado predicado){
		
		resultado = new ArrayList<Integer>();
		
		for(Integer valor:lista) {
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
	public static List<Integer> proveer(int cuantos,Proveedor proveedor){
		
		resultado = new ArrayList<Integer>();
		
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
	 */
	public static List<Integer> transformar(List<Integer> lista,Funcion funcion){
		
		resultado = new ArrayList<Integer>();
		
		for(Integer valor:lista) {			
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
	public static List<Integer> actuarSobreLista(List<Integer> lista,Consumidor consumidor){
		
		for(Integer valor:lista) {
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
	public static void consumirLista(List<Integer> lista,Consumidor consumidor){
		
		for(Integer valor:lista) {
			consumidor.aceptar(valor);			
		}
	}
	
	
	/**
	 * Reducir.
	 * @param lista the lista
	 * @param identidad the identidad
	 * @param funcionBinaria the funcion binaria
	 * @return the integer
	 */
	public static Integer reduciryAcumular(List<Integer> lista,Integer acumulador ,FuncionBinaria funcionBinaria) {
		
		int total=acumulador;
		for(Integer numero:lista) {
			total=funcionBinaria.aplicar(total,numero);			
		}
		return total;
		
		
	}
	

}
