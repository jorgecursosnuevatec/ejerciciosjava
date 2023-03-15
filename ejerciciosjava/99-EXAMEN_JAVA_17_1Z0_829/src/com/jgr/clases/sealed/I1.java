package com.jgr.clases.sealed;

/**
 * The Interface I1.
 * como C1 esta definida dentro de I1 no hace falta el permit
 * pero al declarar que C2 implementa I1 entonces tengo que ponerlas a las dos
 * 
 */
//public sealed interface I1 permits C2 {
public sealed interface I1 permits C1,C2 {	

}

final class C1 implements I1{
	
}
