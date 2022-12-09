package com.jgr.excepciones.lanza;

public class ManejoExcepciones {

	public static void main(String[] args) {
		
		int resultado=0;
		
		try{
			resultado = 10/1;
		}
		//catch(Exception e) {e.printStackTrace(System.out);}
		catch(ArithmeticException e) {e.printStackTrace(System.out);}
		

	}

}
