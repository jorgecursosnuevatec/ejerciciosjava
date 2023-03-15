package com.jgr.lambda.simples;

import java.util.function.BiConsumer;

/**
 * The Class LanzadoraBiConsumer.
 * 
 * Dispone del método abstracto accept, que realiza algún tipo de procesamiento con el objeto recibido
 * void accept(T t, U u);
 * 
 * 
 * https://mkyong.com/tag/functional-interface/
 */

public class LanzadoraBiConsumer {
	

//acepta dos variables y una funcion como parametros de entrada
	static <T> void addTwo(T a1, T a2, BiConsumer<T, T> c) {
        c.accept(a1, a2);
    }


	
	public static void main(String[] args) {
		
		//definimos lo que tiene que hacer con los dos parametros que recibe		
		BiConsumer<Integer,Integer> sumaDos =(x,y)->System.out.println("suma en el Main->"+(x+y));		
		sumaDos.accept(10, 2);
		
		//llama a la funcion y le pasa como parametros enteros/string y lo que queremos que haga con ellos
		addTwo(1, 2, (x, y) -> System.out.println("En addTwo->"+(x - y)));          // 3
        addTwo("Node", ".js", (x, y) -> System.out.println(x + y)); // Node.js
		
	
		
	}

}
