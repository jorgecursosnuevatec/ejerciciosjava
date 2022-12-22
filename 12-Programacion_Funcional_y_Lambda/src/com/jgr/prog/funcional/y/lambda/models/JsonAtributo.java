package com.jgr.prog.funcional.y.lambda.models;

import java.lang.annotation.*;


/**
 * The Interface JsonAtributo.
 * Target->indica a que se va a aplicar,en este caso a un campo,puede ser clase,constructor,metodo....
 * Retention->contexto en el que se va a ejecutar,este en ejecucion,class en compilacion
 * Documented->que se documenta en el api
 * Inherited-> si es sobre una clase,si afecta clases hijas
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    
    /**
     * Nombre.
     * es un atributo que se define como un metodo,se puede añadir un valor por defecto 
     * @return the string
     */
    String nombre() default "";
    
    /**
     * Capitalizar.
     *
     * @return true, if successful
     */
    boolean capitalizar() default false;
}
