package com.jgr.clases.sealed;

import com.jgr.clases.sealed.modelo.CarModelo;
import com.jgr.clases.sealed.modelo.TruckModelo;
import com.jgr.clases.sealed.modelo.VehicleModelo;

/**
 * The Class LanzadoraSealed.
 * Con Java 15/17
 * Esta función se trata de habilitar un control de herencia más detallado en Java.
 * El sellado permite que las clases y las interfaces definan sus subtipos permitidos.
 * 
 * 
 * https://www.baeldung.com/java-sealed-classes-interfaces
 * Como ejemplo, imagine un dominio comercial que solo funcione con automóviles y camiones, no con motocicletas.
 * Al crear la clase abstracta VehicleModelo en Java, deberíamos poder permitir que solo las clases CarModelo y TruckModelo 
 * la extiendan. De esa forma,queremos asegurarnos de que no habrá un mal uso de la clase
 *  abstracta VehicleModelo dentro de nuestro dominio
 * 
 * Una clase sellada impone tres restricciones importantes a sus subclases permitidas:
 *	Todas las subclases permitidas deben pertenecer al mismo módulo que la clase sellada.
 *	Cada subclase permitida debe extender explícitamente la clase sellada.
 *	Cada subclase permitida debe definir un modificador: final , sealed o non-sealed.
 * 
 * 
 * 
 * 
 */
public class LanzadoraSealed {

	
	public static void main(String[] args) {
		
		VehicleModelo vehicleModelo = new CarModelo(15, "Parametro");
		
		if (vehicleModelo instanceof CarModelo carModelo) {
		    System.out.println("numero de Asientos->"+carModelo.getNumberOfSeats());
		} else if (vehicleModelo instanceof TruckModelo truckModelo) {
		    System.out.println("numero de Asientos->"+truckModelo.getLoadCapacity());
		    
		} else {
		    throw new RuntimeException("Unknown instance of VehicleModelo");
		}
	}

}
