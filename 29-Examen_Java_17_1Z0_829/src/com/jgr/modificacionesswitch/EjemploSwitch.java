package com.jgr.modificacionesswitch;

/**
 * The Class EjemploSwitch.
 * desde java 14
 * en caso de que se use -> importante el ; al final
 * si hay mas de una instruccion hay que poner llaves y el valor se devuelve con yield+variable
 * no hay break
 * obligatorio default excepto si todo esta controlado con case
 * 
 */
public class EjemploSwitch {
	public static void main(String[] args) {
		//desde java 14 se pueden usar varios case separados por ,
		//literales,constantes o tipos enumerados
		int res=3;		
		switch(res) {		
		case 1:
			System.out.println("valor1");
		case 2,3,4:
			System.out.println("valor resto");
		}
		
		
		//tb desde 14 se pueden usar expresiones
		int nota=4;
		String resultado = switch(nota) {
		case 1,2,3,4->"\nsuspenso";
		case 5,6->"\nAprobado";
		default -> throw new IllegalArgumentException("\nUnexpected value: " + nota);
		};//IMPORTANTE EL ; AL FINAL ES UNA UNICA EXPRESION
		
		
		//EN CASO DE QUE HAYA MAS DE UNA INSTRUCCION ENTRE LLAVES, RETORNO CON YIELD
		//Y NO HAY ; DESPUES DE LAS LLAVES
		//NO HAY BREAK
		resultado = switch(nota) {
		case 1,2,3,4->"\nsuspenso";
		case 5,6->{
			String retorno= "\nSalida"+(5*20);
			yield retorno;			
			}		
		default -> throw new IllegalArgumentException("\nUnexpected value: " + nota);	
		};//IMPORTANTE EL ; AL FINAL ES UNA UNICA EXPRESION

		System.out.println(resultado);
		
		
		//USANDO UN ENUM
		//enum Data{UNO,DOS,TRES};
		Data a = Data.DOS;		
		int r=switch(a) {
		case UNO->1;
		case DOS->2;
		case TRES->3;
		};
		
		//se utiliza una expresion,pero NO devuelve resultado el sysout(no es resultado = switch(nota)
		//como el anterior) no es obligatorio
		//definir todos los resultados, no es necesario el default
		//como el switch es con flecha no hace falta break
		
		int data=10;
		int n=2;
		
		switch(data/n) {		
		case 1,3->System.out.println("\nlow");
		case 4,5->System.out.println("\nmedium");		
		}
		
		
		
		//en este SI usamos el resultado como expresion, lo sacamos en el sysout, SI 
		//es necesario el default. en el anterior hacemos el sysout en el resultado de la operacion
		//por eso en este tenemos que declarar el default
		String cad ="""				
				a""";
		
		System.out.println(
		switch(cad.indent(1).length()){
		case 1-> "es el 1";
		case 2-> "es el 2";
		default-> "\nes default";	
		
		});
		
		
		
		
		
		
	}
		


}
