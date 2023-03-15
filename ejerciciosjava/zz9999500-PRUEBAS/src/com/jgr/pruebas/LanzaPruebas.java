package com.jgr.pruebas;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


 class Permuter{
	  static void permute(int n, char[]a) {
		 if (n==0)
			 System.out.println(String.valueOf(a));
		 else
			 for (int i=0 ;i<n ; i++) {
				 permute(n-1,a);
				 swap(a,n%2==0?i:0,n);
			 }
	 }
	  static void swap(char[] a,int i ,int j) {
		 char saved = a[i];
		 a[i] = a[j];
		 a[j] = saved;
	 }
	 
 }
 

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
		
		ArrayList<String> nombres=new ArrayList<>();
		System.out.println("add"+nombres.add("Maria"));
		nombres.add("Maria"); //elemento en posición 0
		System.out.println("set"+nombres.set(1,"Angel")); //elemento en posición 1

		char [] vocales = {'a', 'e', 'i', 'o', 'u'}; 
		
		Permuter.permute(4, vocales);
	
		
		
		
		 }
		
		

}
