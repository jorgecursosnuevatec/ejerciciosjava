package com.jgr.ejercicios.opcional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * The Class EjemploOptional.
 * uso del optional.
 * ofNullable->si es nulo no da error
 * ifPresent->si esta presente...,
 * ifPresentOrElse->si esta presente..., si es nulo ....
 * get()->devuelve el valor,si no hay lanza NoSuchElementException
 * orElse()->si no hay devuelve un predeterminado
 * Hay variantes OptionalInt y OptionalDouble 
 * Optional<T> max(Comparator<?super T> comparator)
 * max->devuelve el mayor,utiliza comparator
 * min->devuelve en menor,utiliza comparator  
 * OptionalDouble average()->devuelve la media en un double
 * OptionalInt max() y min(),
 */
public class EjemploOptional {
    
    public static void main(String[] args) {
        
        String nombre = "Andrés";
        Optional<String> opt = Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        }

        System.out.println(opt.isEmpty());

        opt.ifPresent( valor -> System.out.println("Hola " + valor));

        nombre = "John";
        //con el ofNullable no da error si efectivamente es nulo
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor),
                () -> System.out.println("No está presente"));

        if(opt.isPresent()){
            System.out.println("Hola " + opt.get());
        } else {
            System.out.println("No está presente");
        }

        Optional<String> optEmpty = Optional.empty();
        System.out.println("optEmpty = " + optEmpty);
        System.out.println(optEmpty.isPresent());
        

        //busca el mayor
		Stream<Integer> str = Stream.of(2, 5, 7, 9, 9, 23);
		Optional<Integer> op = str.max((a,b)->a-b);		
		System.out.println(op.get());
		
		// creating a stream
        DoubleStream stream = DoubleStream.of(2.5, 3.6, 4.7, 5.0, 6.2);  
        // OptionalDouble is a container object
        // which may or may not contain a
        // double value.
        OptionalDouble obj = stream.average();
        System.out.println("opcional double->"+obj);
		
		
		
		
    }
}
