package com.jgr.clases.sealed.records;

// TODO: Auto-generated Javadoc
/**
 * The Interface VehicleRecord.
 */
public sealed interface VehicleRecord permits CarRecord, TruckRecord {

    /**
     * Gets the registration number.
     *
     * @return the registration number
     */
    String getRegistrationNumber();

}
