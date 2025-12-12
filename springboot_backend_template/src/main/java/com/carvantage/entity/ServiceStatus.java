package com.carvantage.entity;

public enum ServiceStatus {
	PENDING,        // Service created but not started
    INPROGRESS,     // Mechanic is working on car
    WAITINGFORPARTS,// Work stopped because parts are required
    COMPLETED,      // Service work finished
    DELIVERED       // Car handed back to customer

}
