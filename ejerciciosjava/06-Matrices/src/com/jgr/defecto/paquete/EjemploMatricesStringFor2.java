package com.jgr.defecto.paquete;
public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = { {"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};
        

        for(String[] fila: nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
        
        for(int i = 0; i < nombres.length; i++){

            for(int j = 0; j < nombres[i].length; j++){
                System.out.print("Fila->"+i + "\t");
                System.out.print("Columna->"+j + "\t");
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
