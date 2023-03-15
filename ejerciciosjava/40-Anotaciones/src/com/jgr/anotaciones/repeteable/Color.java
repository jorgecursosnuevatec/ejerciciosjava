package com.jgr.anotaciones.repeteable;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * The Interface Color.
 * 
 * Colors contiene un array de Color
 * Shirt es la clase que lo va a usar
 */
@Repeatable(Colors.class)
@interface Color {
  
  String name();
}
@Retention(RetentionPolicy.RUNTIME)
@interface Colors {
  Color[] value();
}
@Color(name = "red") @Color(name = "blue") @Color(name = "green")
class Shirt {
}

@Color(name = "uncolor") @Color(name = "otrocolor") @Color(name = "otrocolormas")
class Prueba{}