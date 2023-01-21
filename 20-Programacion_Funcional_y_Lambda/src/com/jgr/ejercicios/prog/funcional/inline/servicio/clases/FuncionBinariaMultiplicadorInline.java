package com.jgr.ejercicios.prog.funcional.inline.servicio.clases;

import com.jgr.ejercicios.prog.funcional.inline.servicio.interfaces.FuncionBinariaInline;
import com.jgr.ejercicios.prog.funcional.servicio.interfaces.FuncionBinaria;


/**
 * The Class FuncionBinariaMultiplicador.
 * Seria un BiFunction,recibe dos parametros,hace algo y devuelve algo
 */
public class FuncionBinariaMultiplicadorInline implements FuncionBinariaInline{

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
