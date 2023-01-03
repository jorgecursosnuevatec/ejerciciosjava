package com.jgr.formateado.datos;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * The Class FormatoNumeros.
 * de java.text
 */
public class FormatoNumeros {
	public static void main(String[] args) {
		double salario = 1256.678;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("EEUU->"+nf.format(salario));
		nf = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println("China->"+nf.format(salario));
		
	

	}

}
