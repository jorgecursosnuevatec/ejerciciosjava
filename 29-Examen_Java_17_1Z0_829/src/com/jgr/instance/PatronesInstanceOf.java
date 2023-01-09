package com.jgr.instance;


/**
 * The Class PatronesInstanceOf.
 * para comprobar si un objeto es de un tipo especifico
 * se puede usar con clases e interfaces
 * si no hay relacion de herencia da error de compilacion
 * String s ="my cad";
 * if(s instanceof Integer)->daria error de compilacion
 * 
 * desde Java 16 se puede asignar un objeto a un tipo especifico sin hacer cast
 * 
 * antes de java 16
 * Object ob = new String("mi cadena");
 * if(ob instanceof String){
 * 		String s=(String)ob;  
 * }
 * 
 * desde java 16 podemos hacer
 * if(ob instance of String s)
 * 
 * 
 * Si el objeto es nulo instanceof devuelve falso
 */
public class PatronesInstanceOf {
	
	static class A{
		public void testA() {System.out.println("Esto es A");}
	}
	
	static class B extends A{
		public void testB() {System.out.println("Esto es B");}
	}
	static class C extends B{
		public void testC() {System.out.println("Esto es C");}
	}
	
	public static void main(String[] args) {

		
		Object ob = new String("Mi cadena");
		//antes de java 16
		if(ob instanceof String) {
			String s = (String)ob;
			System.out.println("\nlongitud antes de java 16->"+s.length());
			
			
		}
		
		//despues de java 16, no es necesario hacer el cast,directamente se convierte y se asigna
		if(ob instanceof String s) {			
			System.out.println("\nlongitud despues de java 16->"+s.length());
		}
		
		
		//no da error porque si el objeto es nulo instanceof devuelve falso
		String cad = null;
		Object obj = cad;
		if(obj instanceof String s) {
			System.out.println("\nlongitud ejemplo"+s.length());
		}
		
		
		
		
		A objeto = new C();
		
		//correcto hacerlo asi,como c hereda de b es true 
		if (objeto instanceof B b) {			
			System.out.println("\nb.testB()->");
			b.testB();
		}
		
		//es un objecto C,es correcto entraria por el if
		if (objeto instanceof C c) {			
			System.out.println("\nc.testC()->");
			c.testC();
		}else {
			objeto.testA();
		}

		
	}

}
