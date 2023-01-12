package com.jgr.clases.sealed;

import java.util.ArrayList;


/**
 * The Class ClaseA.
 * ver explicacion en ClaseAClaseBClaseCLanzadora.
 */
public sealed class ClaseA extends ArrayList permits ClaseB{
	
	/**
	 * Test.
	 */
	void test() {System.out.println("ClaseA");}

}
