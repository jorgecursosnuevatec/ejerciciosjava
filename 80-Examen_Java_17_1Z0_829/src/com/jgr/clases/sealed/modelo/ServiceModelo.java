package com.jgr.clases.sealed.modelo;


/**
 * The Interface ServiceModelo.
 * Para sellar una interfaz, podemos aplicar el modificador Sealed a su declaración. 
 * La cláusula de permisos luego especifica las clases que pueden implementar la interfaz sellada:
 * 
 * 
 */
public sealed interface ServiceModelo permits CarModelo, TruckModelo {

    /**
     * Gets the max service interval in months.
     *
     * @return the max service interval in months
     */
    int getMaxServiceIntervalInMonths();

    /**
     * Gets the max distance between services in kilometers.
     *
     * @return the max distance between services in kilometers
     */
    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }

}