package com.jgr.clases.sealed.modelo;

/**
 * The Class VehicleModelo.
 * Similar a las interfaces, podemos sellar clases aplicando el mismo modificador sellado . 
 * La cláusula de permisos debe definirse después de cualquier cláusula de extensión o implementación :
 */
public abstract sealed class VehicleModelo permits CarModelo, TruckModelo {

    /** The registration number. */
    protected final String registrationNumber;

    /**
     * Instantiates a new vehicle.
     *
     * @param registrationNumber the registration number
     */
    public VehicleModelo(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Gets the registration number.
     *
     * @return the registration number
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

}