package com.jgr.sobreescritura.interfaces;


/*
 * COMO EL METODO sumatorio esta definido como default en la interface Calculadora y
 * en Estadisticas, elegimos una en Matematicas, podemos sobreescribirlo directamente
 * o como hacemos en este elegimos de cual de las dos lo queremos Estadisticas.super.sumatorio(nums)
 * 
 * */
public interface Estadisticas{
	int media(int[] nums);
	default int sumatorio(int[] nums) {
		return nums[0]+nums[nums.length-1];
	}
}