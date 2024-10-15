package com.bridgelabz.invoicegenerator;

public class Ride {
    public double distance;
    public double time;
    public RideType rideType;

    public Ride(double distance, double time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
}
