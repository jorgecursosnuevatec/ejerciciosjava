package com.jgr.bloques.texto;


/**
 * The Class Indentacion.
 * desde Java 12
 * añade espacios al principio de cada linea,si es negativo los elimina
 * incluye salto de linea al final si no lo tiene
 * 
 * stripIndent()
 * desde Java 15
 * tras una concatenacion elimina los espacios existentes antes de un salto de linea
 * 
 */
public class Indentacion {
	public static void main(String[] args) {
		
		
		//stripIndent()
		String mycad="""
				x
				y
				z""";
		
		//5,las letras y sus saltos de linea menos la z
		System.out.println(mycad.length());
		//9 porque a la cadena se añade un espacio delante de cada+salto linea al final
		System.out.println("\nmycadIndent Cadena->"+mycad.indent(1));
		System.out.println(mycad.indent(1).length());
		//salto de linea al final,no hay espacios asi que no los elimina,pero añade el salto de linea
		System.out.println("\nmycadIndent Cadena -1->"+mycad.indent(-1));
		System.out.println(mycad.indent(-1).length());
		
		
		
		//stripIndent()		
		String c1 ="x \n";
		String c2 =" a \n";
		//elimina los espacios antes del salto de linea \n pero NO elimina el que hay antes de la a
		System.out.println("\nstripIndent Cadena->"+(c1+c2).stripIndent());
		System.out.println("stripIndent->"+(c1+c2).stripIndent().length());
		
	
		//sin nada mediria 2
		String c3 = " a \n";
		//sin nada la b mediria 1,la c 3 por el espacio y el \ y la d 2 por el espacio antes
		String c4 = """
				b
				 c\
				 d
				""";
		
		//con stripIndent  
		//c3->se quita el espacio antes del salto de linea con el indent
		//c4-> nada
		//con indent
		//c3->se quita el espacio antes de la a
		//c4->se quita el espacio antes de c y pero NO el de antes de la d porque no hay salto de linea,solo \
		//el salto de linea despues de la d si se queda
		//c3->a+salto de linea 2
		//c4->b+salto de linea 2,c\ 2,d+salto de linea
		
		//al aplicar stripIndent eliminamos espacio entre a y b. Con indent eliminamos espacios delante
		//de a y c,pero no de d porque forma parte de la linea anterior. el resultado de la operacion
		//es a \nb\nc d\n
		System.out.println("\ncadena->"+ (c3+c4).stripIndent().indent(-1));
		System.out.println("longitud->"+ (c3+c4).stripIndent().indent(-1).length());

	}

}
