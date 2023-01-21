package com.jgr.ejercicios.prog.funcional.servicio.clases;

import com.jgr.ejercicios.prog.funcional.servicio.interfaces.FuncionBinaria;


/**
 * The Class FuncionBinariaMultiplicador.
 * Seria un BiFunction,recibe dos parametros,hace algo y devuelve algo
 */
public class FuncionBinariaMultiplicador implements FuncionBinaria{

	/**
	 * Aplicar.
	 *
	 * @param acumulador the acumulador
	 * @param valor the valor
	 * @return the integer
	 */
	@Override
	public Integer aplicar(Integer acumulador, Integer valor) {
		
		return acumulador*valor;
	}

}
