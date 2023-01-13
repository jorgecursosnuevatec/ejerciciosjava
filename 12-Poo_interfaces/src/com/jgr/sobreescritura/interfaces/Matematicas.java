package com.jgr.sobreescritura.interfaces;


/*
 * COMO EL METODO sumatorio esta definido como default en la interface Calculadora y
 * en Estadisticas, elegimos una en Matematicas, podemos sobreescribirlo directamente
 * o como hacemos en este elegimos de cual de las dos lo queremos Estadisticas.super.sumatorio(nums)
 * 
 * */
public class Matematicas implements Calculadora,Estadisticas{
	@Override
	public int sumatorio(int[] nums) {
		
		return Estadisticas.super.sumatorio(nums);
	}
	
	@Override
	public int media(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int restar(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
}