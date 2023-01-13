package com.jgr.clases.anonimas.modelo;



public class PrinterImpl implements IPrinter{

	@Override
	public void print(String cad) {
		System.out.println("Dentro de clase PrinterImp->"+cad);
		
	}
	
}
