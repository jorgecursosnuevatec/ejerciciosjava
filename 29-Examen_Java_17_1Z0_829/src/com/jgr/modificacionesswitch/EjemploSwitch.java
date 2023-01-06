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
		case 1,2,3,4->"suspenso";
		case 5,6->"Aprobado";
		default -> throw new IllegalArgumentException("Unexpected value: " + nota);
		};//IMPORTANTE EL ; AL FINAL ES UNA UNICA EXPRESION
		
		
		//EN CASO DE QUE HAYA MAS DE UNA INSTRUCCION ENTRE LLAVES, RETORNO CON YIELD
		//Y NO HAY ; DESPUES DE LAS LLAVES
		//NO HAY BREAK
		resultado = switch(nota) {
		case 1,2,3,4->"suspenso";
		case 5,6->{
			String retorno= "Salida"+(5*20);
			yield retorno;			
			}		
		default -> throw new IllegalArgumentException("Unexpected value: " + nota);	
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
	}
		


}
