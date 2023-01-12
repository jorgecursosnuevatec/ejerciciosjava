package com.jgr.patrones.singleton;


/**
 * The Class LanzadoraSingleton.
 * El constructor es privado, se obtiene una instancia que es la que verifica si existe la instancia
 * que se guarda en un atributo que tb es estatico
 * es un patron creacional
 */
public class LanzadoraSingleton {

	public static void main(String[] args) {
		
       ConexionBDSingleton con = null;
        for(int i = 0; i<10;i++){
            con = ConexionBDSingleton.getInstancia();
            System.out.println("con = " + con);
        }
        ConexionBDSingleton con2 = ConexionBDSingleton.getInstancia();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstancia();
        //imprime siempre la misma referencia porque solo hay una instancia
        //solo sale una vez el msg del constructor
        boolean b1 = ((con == con2) && (con2 == con3) && (con == con3));
        System.out.println("b1 = " + b1);
    }
}