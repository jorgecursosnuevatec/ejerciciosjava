package com.jgr.prog.funcional.y.lambda;

import com.jgr.prog.funcional.y.lambda.models.FormatearFrase;

public class EliminaEspaciosConvierteMayuscula {

    public static void main(String[] args) {

        FormatearFrase format = frase -> {
            return frase.replace(".", "")
                    .replace(",", "").replace(" ", "")
                    .toUpperCase();
        };
        
        String resultado = format.limpiarYformatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);
    }
}
