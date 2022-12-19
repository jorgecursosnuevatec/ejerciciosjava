package com.jgr.prog.funcional.y.lambda;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;


import com.jgr.prog.funcional.y.lambda.models.*;

/**
 * The Class InterfazConsumeryBi.
 * tiene un metodo abstracto que se llama accept que realiza algun proceso con lo que recibe
 *void accept(T t).NO DEVUELVE NADA
 *default Consumer<T> andThen(Consumer<? super T> after) a un consumer le aplica otro
 *Represents an operation that accepts a single input argument and returns no result.
 * Unlike most other functional interfaces,Consumer is expected to operate via side-effects.
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Consumer.html
 */
public class InterfazConsumeryBi {
	
	public static void main(String[] args) {
		
		//sacamos el dato recibido
		Consumer<String> sacarMsg = (String a)->System.out.println(a);
		sacarMsg.accept("\nHola desde Main");

		//acepta una fecha y la imprime,no devuelve nada
		Consumer<Date> consumidor = fecha -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(f.format(fecha));
		};
		consumidor.accept(new Date());

		// le pasamos un string y un integer,no devuelve nada
		BiConsumer<String, Integer> consumidorBi = (nombre, edad) -> System.out
				.println(nombre + ", tiene " + edad + " años!");
		consumidorBi.accept("pepe", 20);
		Consumer<String> consumidor2 = System.out::println;
		consumidor2.accept("Hola mundo lambda");

		// Le pasamos un string y lo saca por pantalla
		List<String> numbers = Arrays.asList("uno", "dos", "tres");
		Consumer<String> cs = s -> System.out.println("Consumer->" + s);
		// a ese consumer le aplicamos otro y lo saca en mayusculas
		Consumer<String> salida = cs.andThen(a -> System.out.println(":" + a.toUpperCase()));
		numbers.forEach(salida);

		List<String> nombres = Arrays.asList("andres", "pepe", "luz", "paco");
		nombres.forEach(consumidor2);

		//en este caso el supplier lo que hace es crear un usuario y devolverlo, 
		Supplier<Usuario> creaUsuario = Usuario::new;
		Usuario usuario = creaUsuario.get();

		//con este metodo re
		BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
		// esta es otra manera de hacerlo
		BiConsumer<Usuario, String> asignarNombre2 = (usu, nombre) -> {
			usu.setNombre(nombre);
		};

		asignarNombre.accept(usuario, "Andrés");
		System.out.println("Nombre usuario: " + usuario.getNombre());
		asignarNombre2.accept(usuario, "FranciscoLorin");
		System.out.println("Nombre usuario: " + usuario.getNombre());

		Consumer<String> cr = (String a) -> System.out.println(a);
		cr.accept("Hola");

		Persona array[] = { new Persona("Nombre3", 66), new Persona("Nombre2", 67), new Persona("Nombre1", 66),
				new Persona("Nombre3", 67) };

		List<Persona> lista = new ArrayList<>(Arrays.asList(array));
		//
		lista.forEach(n -> System.out.println(n + " recuperado"));

		// Create a properties and add some values
		Properties properties = new Properties();
		properties.put("Pen", 10);
		properties.put("Book", 500);
		properties.put("Clothes", 400);
		properties.put("Mobile", 5000);

		// le paso el map
		properties.forEach((k, v) -> {

			v = (int) v + 100;
			properties.replace(k, v);
		});

		properties.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

		// Create the first list
		List<Integer> listaa = new ArrayList<Integer>();
		listaa.add(2);
		listaa.add(1);
		listaa.add(3);

		// Create the second list
		List<Integer> listb = new ArrayList<Integer>();
		listb.add(2);
		listb.add(1);
		listb.add(2);

		// BiConsumer to compare both lists
		BiConsumer<List<Integer>, List<Integer>> equals = (list1, list2) -> {
			if (list1.size() != list2.size()) {
				System.out.println("False1");
			} else {
				for (int i = 0; i < list1.size(); i++)
					if (list1.get(i) != list2.get(i)) {
						System.out.println("False2");
						return;
					}
				System.out.println("True");
			}
		};
		equals.accept(listaa, listb);

	}
	
	
	

}
