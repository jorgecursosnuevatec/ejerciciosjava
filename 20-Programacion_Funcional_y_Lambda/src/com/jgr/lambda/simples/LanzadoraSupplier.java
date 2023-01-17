package com.jgr.lambda.simples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.jgr.lambda.simples.interfaz.modelo.GeneraListaNumeros;
import com.jgr.lambda.simples.interfaz.modelo.ImplementaSupplier;

/**
 * The Class LanzadoraSupplier.
 * Dispone del método abstracto get, que NO recibe ningún parámetro y devuelve como resultado un objeto:
 * T get()
 * 
 * 
 * https://mkyong.com/tag/functional-interface/
 * 
 */
public class LanzadoraSupplier {

	 private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	 
	 
	public static void main(String[] args) {
		
		//el metodo s crea una nueva instancia de un objeto LocalDateTime
		
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(time);
        
        //el metodo s1 devuelve una instancia de LocalDateTime formateado

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();
        System.out.println(time2);
        
        List<Integer> numeros = new ArrayList<Integer>();
		new GeneraListaNumeros();
		numeros = GeneraListaNumeros.getLista();
        
        ImplementaSupplier iS = new ImplementaSupplier();
        
        iS.sumaListaYObtieneValorExterno(numeros, //le paso la lista
        		//esta seria la expersion Supplier, es la unica que no tiene parametros de entrada
        		()->(int)Math.random()*100+1      
        		);
        		
        		
	}

}
