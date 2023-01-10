package com.jgr.patron.decorador;

import com.jgr.patron.decorador.comun.Formateable;
import com.jgr.patron.decorador.modelo.Texto;
import com.jgr.patron.decorador.modelo.auxiliar.MayusculaDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.RemplazarEspaciosDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.ReversaDecorador;
import com.jgr.patron.decorador.modelo.auxiliar.SubrayadoDecorador;


/**
 * The Class EjemploDecoradorCafe. agrega funcionalidad pero sin utilizar herencia
 * El patrón Decorator responde a la necesidad de añadir dinámicamente funcionalidad a un Objeto. 
 * Esto nos permite no tener que crear sucesivas clases que hereden de la primera incorporando la nueva 
 * funcionalidad, sino otras que la implementan y se asocian a la primera
 * Se relacionan por medio de una interfaz que es la que añade funcionalidades
 * todos estan relacionados con formateable.
 * https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)
 * 
 * 
 */
public class EjemploDecorador {

	public static void main(String[] args) {

		Formateable texto = new Texto("Hola que tal Andrés!");
		MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
		ReversaDecorador reversa = new ReversaDecorador(mayuscula);
		SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
		RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

		System.out.println(remplazar.darFormato());
	}
}
