package com.jgr.clases.sealed;


/**
 * The Class CarModelo.
 * Una subclase permitida también puede declararse sellada . 
 * Sin embargo, si lo declaramos no sellado, entonces está abierto para la extensión:
 * 
 */
public non-sealed class CarModelo extends VehicleModelo implements ServiceModelo {

    /** The number of seats. */
    private final int numberOfSeats;

    /**
     * Instantiates a new car.
     *
     * @param numberOfSeats the number of seats
     * @param registrationNumber the registration number
     */
    public CarModelo(int numberOfSeats, String registrationNumber) {
        super(registrationNumber);
        this.numberOfSeats = numberOfSeats;
    }

    /**
     * Gets the number of seats.
     *
     * @return the number of seats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * Gets the max service interval in months.
     *
     * @return the max service interval in months
     */
    @Override
    public int getMaxServiceIntervalInMonths() {
        return 12;
    }

}