package com.jgr.ejercicios.opcional;

import java.util.Optional;

/**
 * The Class EjemploOptional.
 * uso del optional.
 * ofNullable->si es nulo no da error
 * ifPresent->si esta presente...,
 * ifPresentOrElse->si esta presente..., si es nulo ....
 * 
 */
public class EjemploOptional {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
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
    }
}
