package com.jgr.prog.funcional.y.lambda.models;
import java.lang.annotation.*;

/**
 * The Interface Init.
 * Target->indica a que se va a aplicar,en este caso a un campo,puede ser clase,constructor,metodo....
 * Retention->contexto en el que se va a ejecutar,este en ejecucion,class en compilacion
 * Documented->que se documenta en el api
 * Inherited-> si es sobre una clase,si afecta clases hijas 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Init {
}
