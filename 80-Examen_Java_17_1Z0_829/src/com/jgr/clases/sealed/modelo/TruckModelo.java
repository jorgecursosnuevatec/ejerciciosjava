package com.jgr.clases.sealed.modelo;


/**
 * The Class TruckModelo.
 * Una subclase permitida debe definir un modificador. 
 * Puede declararse final para evitar que extiendan de ella
 */
public final class TruckModelo extends VehicleModelo implements ServiceModelo {

    /** The load capacity. */
    private final int loadCapacity;

    /**
     * Instantiates a new truck.
     *
     * @param loadCapacity the load capacity
     * @param registrationNumber the registration number
     */
    public TruckModelo(int loadCapacity, String registrationNumber) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Gets the load capacity.
     *
     * @return the load capacity
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Gets the max service interval in months.
     *
     * @return the max service interval in months
     */
    @Override
    public int getMaxServiceIntervalInMonths() {
        return 18;
    }

}