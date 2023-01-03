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
		*/
		
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.submit(()->System.out.println("Hola"));
		ex.submit(()->System.out.println("Mundo"));
		
		

	}

}