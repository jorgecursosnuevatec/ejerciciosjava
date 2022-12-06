package com.jgr.paquete.hilos.modelos;
import static com.jgr.paquete.hilos.thread.Sincronizacion.*;

public class ImprimirFrases implements Runnable {
    private String frase1, frase2;

    public ImprimirFrases(String frase1, String frase2) {
        System.out.print("\n####ImprimirFrases constructor\n");    	
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        System.out.print("\n###ImprimirFrases Metodo run\n");    	
        imprimirFrases(this.frase1, this.frase2);
    }
}
