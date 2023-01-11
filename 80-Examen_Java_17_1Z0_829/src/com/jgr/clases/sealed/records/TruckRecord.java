package com.jgr.clases.sealed.records;

// TODO: Auto-generated Javadoc
/**
 * The  TruckRecord.
 */
public record TruckRecord(int loadCapacity, String registrationNumber) implements VehicleRecord {

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
     * Gets the load capacity.
     *
     * @return the load capacity
     */
    public int getLoadCapacity() {
        return loadCapacity;
    }

}
