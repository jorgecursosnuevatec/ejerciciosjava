package com.jgr.pruebas;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LanzaPruebas {

	public static void main(String[] args) {
		/*
		Thread t1= new Thread(new Tarea());
		Thread t2= new Thread(new Tarea());
		t1.start();
		t1.run();
		t2.start();
		t1.run();
		
		
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(()->System.out.println("Hola"));
		ex.submit(()->System.out.println("Mundo"));
		*/
		
		StringBuilder cadena=new StringBuilder();
		 long numero1= System.currentTimeMillis();
		 for(int i=0;i<10000;i++) {
		 
		 cadena.append("hola");
		 cadena.append("que");
		 cadena.append("tal");
		 cadena.append("estas");
		 
		 }
		 long numero2=System.currentTimeMillis();
//		 System.out.println("\n"+cadena);
		 System.out.println("\n"+ (numero2-numero1));
		 
		 String cadena2="";;
		 numero1= System.currentTimeMillis();
		 for(int i=0;i<10000;i++) {
		 
			 cadena2+="hola";
			 cadena2+="que";
			 cadena2+="tal";
			 cadena2+="estas";
			 
		 
		 
		 }
		 numero2=System.currentTimeMillis();
//		 System.out.println("\n"+cadena2);
		 System.out.println("\n"+ (numero2-numero1));
		 
		 
		 

		 }
		
		

}
