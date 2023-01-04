package com.jgr.paquete.hilos.atomic.cyclicbarrier;

/**
 * The Class CyclicBarrierClase.
 * en java.util.concurrent
 *permite sincronizar grupos de threads, es un objeto que permite que un grupo de hilos puedan
 *esperarse unos a otros en un punto concreto
 *cuando todos llegan a la barrera se desbloquean y continuan
 *
 *Constructores
 * CyclicBarrier(int hilos),numero de hilos para sincronizar
 * CyclicBarrier(int hilos,Runnable action),cuando todos alcanzan la barrera se ejecuta la accion
 * 
 * await()->sincroniza los hilos,cuando un hilo lo llama espera a que lleguen los demas, cuando el numero
 * de hilos es igual al del constructor, y si se ha informado en el constructur se ejecuta el runnable
 * se pone a 0 cuando todos han llegado
 * 
 * https://chuwiki.chuidiang.org/index.php?title=Ejemplo_simple_con_CyclicBarrier
 */
public class CyclicBarrierClase {
	public static void main(String[] args) {
		
		
		


	}

}
