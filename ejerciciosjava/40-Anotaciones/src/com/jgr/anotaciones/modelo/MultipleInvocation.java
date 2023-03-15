package com.jgr.anotaciones.modelo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * The Interface MultipleInvocation.
 * Explicacion en AnotacionesTeoria 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MultipleInvocation {
 
    int timesToInvoke() default 1;//como tiene valor por defecto el atributo es opcional
}