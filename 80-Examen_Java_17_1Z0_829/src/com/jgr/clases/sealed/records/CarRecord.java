package com.jgr.clases.sealed.records;


// TODO: Auto-generated Javadoc
/**
 * The  CarRecord.
 */
public record CarRecord(int numberOfSeats, String registrationNumber) implements VehicleRecord {

    /**
     * Gets the registration number.
     *
     * @return the registration number
     */
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Gets the number of seats.
     *
     * @return the number of seats
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

}
