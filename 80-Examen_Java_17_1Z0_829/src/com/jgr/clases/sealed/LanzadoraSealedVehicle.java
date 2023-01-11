package com.jgr.clases.sealed;





/**
 * The Class LanzadoraSealedVehicle.
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
 *	Todas las subclases permitidas deben pertenecer al mismo módulo/paquete que la clase sellada.
 *	Cada subclase permitida debe extender explícitamente la clase sellada.
 *	Cada subclase permitida debe definir un modificador: final , sealed o non-sealed.
 *	Si una subclase permitida se define como non-sealed todas las subclases de esta tendrian acceso a la clase
 *	base
 * 
 * https://stackoverflow.com/questions/63972130/what-is-the-difference-between-a-final-and-a-non-sealed-class-in-java-15s-seale
 * 
 * Al marcar una clase como sealed, todas las clases que se extienden directamente 
 * (las que están después de la permitscláusula) deben marcarse como final, sealed o non-sealed:
 * 
 * Marcar una clase que extiende una sealed clase como sealed, aplica el mismo efecto: 
 * solo las clases especificadas después de la clausula permits pueden extenderla.
 * non-sealed simplemente "rompe el sello", por lo que el efecto no tiene que continuar en la jerarquía. 
 * La clase de extensión está abierta (nuevamente) para ser extendida por subclases desconocidas.
 * final es efectivamente lo mismo que sealed sin ninguna clase especificada después de la cláusula permits. 
 * Tenga en cuenta que no es posible especificar nada después , por lo que sealed no puede reemplazar final.
 * 
 * Si la clase esta en el mismo fichero java se puede omitir permits
 * p.ej en la clase sealed MyClass defino la clase Other que extiende de MyClass,no es necesario el permits
 * lo mismo si es una clase/interfaz anidada , si en sealed interface MyInter declaro 
 * non-sealed class I1 implements MyInter ,no daria error 
 * 
 * 
 * 
 */
public class LanzadoraSealedVehicle {

	
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
