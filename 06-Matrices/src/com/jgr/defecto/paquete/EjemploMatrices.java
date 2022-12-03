package com.jgr.defecto.paquete;
public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4];
        
        /*
         * 			columna		columna		columna 	columna	
         * fila		1			2			3			4
         * fila		11			12			13			14        
         * */
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("número de filas: " + numeros.length);
        System.out.println("número de columnas: " + numeros[0].length);

        System.out.println("primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("último elemento: " + numeros[numeros.length -1][numeros[1].length -1]);

        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
       
        
        for (int i=0;i<numeros.length;i++) {
        	
        	for (int j=0;j<numeros[i].length;j++) {
        		System.out.println("valor de i->"+i + " j->"+j +" guardado->" + numeros[i][j]);
        	}
        	
        }
        
        int[][] numeros2 = new int[4][4];
        
        /*
         * 			columna		columna		columna 	columna	
         * fila		0			1			2			3
         * fila		0			1			2			3        
         * fila		0			1			2			3        
         * fila		0			1			2			3        
         * */
        
        for (int i=0;i<numeros2.length;i++) {
        	
        	for (int j= 0;j<numeros2[i].length;j++) {
        		

        		System.out.println("valor i->"+i + " valor j->"+j);
        		numeros2[i][j]=j+i;
        		
        		
        	}        	
        }
   
   
   
        
        
    }
}
