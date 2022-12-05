package com.jgr.prog.funcional.y.lambda;

import com.jgr.prog.funcional.y.lambda.models.FormatearFrase;

public class PrincipalEliminaEspacios {

    public static void main(String[] args) {

    	//formatearFrase es una interfaz que realmente no hace nada,solo recibe un parametro
    	//en este caso sustituye ., y elimina los espacios en blanco
        FormatearFrase format = frase -> {
            return frase.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };
        
        String resultado = format.limpiarYformatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);
        
        //aqui utilizando la misma interfaz lo que hago es cambiar "a" por "b"
        FormatearFrase prueba=probando->{
        	return probando.replace("a", "b");
        };
        
        resultado = prueba.limpiarYformatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);
        
    }
    
    
}


