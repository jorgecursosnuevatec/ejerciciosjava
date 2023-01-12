package com.jgr.records;


/**
 * The Class CursoLanzadora.
 * 
 * para reducir la definicion de java bean
 * genera de forma automatica
 * atributos
 * constructor
 * metodos para recuperar valores(como el getter)
 * implementa toString y equals
 * es INMUTABLE cuando se crea
 * son finales,no pueden heredarse
 * no puede heredar ninguna clase
 * los atributos son inmutables
 * los atributos son finales,si se define el constructor se deben dar valores a todos los atributos
 * solo puede tener constantes o atributos definidos en el constructor
 * 
 * hay un constructor llamado compacto que permite realizar validaciones y/o transformaciones de datos
 * que se ejecuta despues del canonico(por defecto) y NO lleva parentesis para los parametros
 * 
 * se permite sobrecarga de constructores,pero siempre deben llamar primero al canonico
 * 
 */
public class CursoLanzadora {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		//constructor canonico
		Curso c1 = new Curso("Java",100);
		//sobreescritura constructor
		Curso c2 = new Curso("Python");
		System.out.println("Duracion curso c2->"+c2.duracion());
		

	}

}
