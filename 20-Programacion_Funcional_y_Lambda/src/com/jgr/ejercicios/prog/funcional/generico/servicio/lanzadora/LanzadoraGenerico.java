package com.jgr.ejercicios.prog.funcional.generico.servicio.lanzadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jgr.ejercicios.prog.funcional.generico.servicio.SuperFuncionesGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.ConsumidorGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.FuncionGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.OperadorBinarioGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.OperadorUnario;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.PredicadoGenerico;
import com.jgr.ejercicios.prog.funcional.generico.servicio.interfaces.ProveedorGenerico;
import com.jgr.ejercicios.prog.funcional.servicio.util.GeneraDatos;

//https://www.youtube.com/watch?v=JpaWSFZRM88&list=PLK6RrRW5qdCMccvDnZb6-0d6uAIwbTQ1A&index=8

/**
 * The Class LanzadoraGenerico.
 * IGUAL QUE ANTERIOR PERO CON TIPOS GENERICOS,CAMBIAMOS INTEGER POR <T>
 * para poder tratar cualquier tipo de dato
 */
public class LanzadoraGenerico {
	
/**
 * Instantiates a new lanzadora.
 */
public LanzadoraGenerico() {
	
	List<Integer> listaInt = new ArrayList<Integer>();
	GeneraDatos.getListaIntegerStreamRango(5, -1, 9999).
			forEach(listaInt::add);;

	
	  //ahora le paso el Predicate, pero en vez de que llame a la interfaz lo que
	 // hago es implementarla //directamente como parametro de entrada
	  SuperFuncionesGenerico.proveer(5, new ProveedorGenerico<Integer>() {	  
	  @Override public Integer obtener() { return new Random().nextInt(1000000); }	  
	  }).forEach(System.out::println);
	  
	  
	  // "creo" la instancia de la interfaz para pasarle como parametro 
	  //lo que  tiene que hacer,que en este caso es que haga el sysout
	  SuperFuncionesGenerico.actuarSobreLista(listaInt, new ConsumidorGenerico<Integer>() {	  
	  @Override public void aceptar(Integer valor) {
	  System.out.println("\nEn ClaseConsumidora->"+valor);
	  
	  } });
	  
	
	  //filtramos sacando solo los impares
	  SuperFuncionesGenerico.filtrar(listaInt, new PredicadoGenerico<Integer>() {	  
	  @Override public boolean test(Integer valor) {	  
	  return valor % 2 != 0; } }).forEach(System.out::println);
	 
	  //acumulamos sumando todos los valores a partir de un numero inicial
	SuperFuncionesGenerico.reduciryAcumular(listaInt, 5,
			new OperadorBinarioGenerico<>() {
		@Override
		public Integer aplicar(Integer acumulador, Integer valor) {
			return acumulador + valor;
		}
	});
	
	
	//sumamos los numeros, creamos lo que tiene que hacer en el metodo aplicar			
	SuperFuncionesGenerico.transformar(listaInt, new FuncionGenerico<Integer,Integer>() {
		@Override
		public Integer aplicar(Integer valor) {			
			return valor*valor;
		}
		
	});	
	
	//este tambien sumaria como hace transformar(listaInt, new FuncionGenerico<Integer,Integer>() 
	SuperFuncionesGenerico.transformar(listaInt, new OperadorUnario<Integer>() {
		@Override
		public Integer aplicar(Integer valor) {			
			return valor*valor;
		}		
	});	
	
	
	//como ahora lo he definido como generico,podemos cambiar lo que hace,
	//ahora en vez de una operacion matematica podemos convertir el resultado a cadena
	SuperFuncionesGenerico.transformar(listaInt, new FuncionGenerico<Integer,String>(){
		@Override
		public String aplicar(Integer valor) {
			
			return String.valueOf(valor*valor);
		}
		
	}).forEach(System.out::println);
		
	
	
	
		
}



	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		new LanzadoraGenerico();

	}
	
	

}
