package com.jgr.genericos.otro.lanzadora;

import com.jgr.genericos.otro.modelos.AnimalGenerico;
import com.jgr.genericos.otro.modelos.AutomovilGenerico;
import com.jgr.genericos.otro.modelos.ClaseGenerica;
import com.jgr.genericos.otro.modelos.MaquinariaGenerico;

public class LanzadoraClaseGenerica {
	
	public static <T> void imprimirGenerico(ClaseGenerica<T> generico){
        for(T a: generico){
            if(a instanceof AnimalGenerico) {
                System.out.println(((AnimalGenerico)a).getNombre() + " tipo: " + ((AnimalGenerico)a).getTipo());
            }
            else if(a instanceof AutomovilGenerico){
                System.out.println(((AutomovilGenerico)a).getMarca());
            } else if(a instanceof MaquinariaGenerico){
                System.out.println(((MaquinariaGenerico)a).getTipo());
            }
        }
	}

	public static void main(String[] args) {
		ClaseGenerica<AnimalGenerico> transporteCaballos = new ClaseGenerica<>(5);
        transporteCaballos.add(new AnimalGenerico("Peregrino", "Caballo"));
        transporteCaballos.add(new AnimalGenerico("grillo", "Caballo"));
        transporteCaballos.add(new AnimalGenerico("Tunquen", "Caballo"));
        transporteCaballos.add(new AnimalGenerico("Topocalma", "Caballo"));
        transporteCaballos.add(new AnimalGenerico("Longotoma", "Toro"));
        imprimirGenerico(transporteCaballos);
        
        ClaseGenerica<MaquinariaGenerico> transMaquinas = new ClaseGenerica<>(3);
        transMaquinas.add(new MaquinariaGenerico("Bulldozer"));
        transMaquinas.add(new MaquinariaGenerico("Grúa Horquilla"));
        transMaquinas.add(new MaquinariaGenerico("Perforadora"));
        imprimirGenerico(transMaquinas);
        
        ClaseGenerica<AutomovilGenerico> transAuto = new ClaseGenerica<>(3);
        transAuto.add(new AutomovilGenerico("Toyota"));
        transAuto.add(new AutomovilGenerico("Mitsubishi"));
        transAuto.add(new AutomovilGenerico("Chevrolet"));
        imprimirGenerico(transAuto);

	}

}
