package com.jgr.clase.ejemplos.java.basico;

public class EjemploArgumentosVariables {


    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1,2);
        variosParametros("Juan", 8, 9 , 10);
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento:" + numeros[i]);
        }
    }
}


