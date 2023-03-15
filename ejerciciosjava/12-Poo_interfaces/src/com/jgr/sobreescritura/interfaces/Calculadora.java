package com.jgr.sobreescritura.interfaces;

/*
 * COMO EL METODO sumatorio esta definido como default en la interface Calculadora y
 * en Estadisticas, elegimos una en Matematicas, podemos sobreescribirlo directamente
 * o como hacemos en este elegimos de cual de las dos lo queremos Estadisticas.super.sumatorio(nums)
 * 
 * */


public interface Calculadora{
	int sumar(int a, int b);
	int restar(int a, int b);
	default int multiplicar(int a, int b) {
		return a*b;
	}
	default int sumatorio(int[] nums) {
		int suma=0;
		for(int n:nums) {
			suma+=n;
		}
		return suma;
	}
}