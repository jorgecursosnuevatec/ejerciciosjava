package com.jgr.anotaciones;

import com.jgr.anotaciones.modelo.AutomaticWeapon;
import com.jgr.anotaciones.modelo.Operator;

/**
 * The Class AnotacionesTeoria.
 * Suministran informacion del entorno de ejecucion(metadatos),siempre delante del nombre del tipo/metodo
 * @NombreAnotacion(atributo1=valor,atributo2=valor....)
 * @Anotacion var data;
 * @Anotacion public void metodo();
 * public @interface NuevaAnotacion()
 * @Target ->a que tipo de elemento se aplica la anotacion
 * @Target(ElementType.METHOD)
 * ElementType.TYPE->aplica a un tipo:clase,interfaz,enumeracion...
 * ElementType.FIELD->a un miembro de la clase
 * ElementType.METHOD-> a un metodo
 * ElementType.PARAMETER-> a parametros de un metodo
 * ElementType.CONSTRUCTOR->a un constructor
 * ElementType.LOCAL_VARIABLE->a variables locales
 * ElementType.ANNOTATION_TYPE->el tipo declarado en si es un tipo de anotacion
 * 
 * @Retention->ambito de acceso
 * @Retention(RetentionPolicy.RUNTIME)
 * RetentionPolicy.SOURCE->retenida a nivel codigo,ignorada por el compilador
 * Retention(RetentionPolicy.CLASS)->retenida en compilacion,ignorada en ejecucion
 * Retention(RetentionPolicy.RUNTIME)->retenida en tiempo de ejecucion,solo se puede acceder en ejecucion
 * 
 * @Documented – Hará que la anotación se mencione en el javadoc.
 * @Inherited – Indica que la anotación será heredada automáticamente.
 * 
 * 
 * Cada método dentro de la anotación es un elemento.
 * Los métodos no deben tener parámetros o cláusulas throws.
 * Los métodos pueden tener valores por defecto
 * Los tipos de retorno están restringidos a tipos primitivos, String, Class,
 *  enum, anotaciones, y arrrays de los tipos anteriores.
 * 
 * https://javadesdecero.es/avanzado/anotaciones-annotations/
 * https://www.adictosaltrabajo.com/2015/08/10/crear-anotaciones-propias-en-java/
 * https://jarroba.com/reflection-en-java/
 * https://jarroba.com/annotations-anotaciones-en-java/
 * 
 * 
 * En este ejemplo creamos la interface @MultipleInvocation 
 * que es usada por la clase AutomaticWeapon. Hay tres tipos de disparo:unico,rafata y automatico
 * para leer la anotacion,se realiza mediante reflexion solo si tiene un nivel de retencion RUNTIME
 * Desde Operator se llama a los metodos y los ejecutara el numero de veces que diga la anotacion
 * 
 * 
 */
public class AnotacionesTeoria {
	public static void main(String[] args) {
	    final AutomaticWeapon weapon = new AutomaticWeapon(30);
        final Operator operator = new Operator();
        operator.operate(weapon);


	}

}
