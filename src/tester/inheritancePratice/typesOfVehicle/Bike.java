package tester.inheritancePratice.typesOfVehicle;

import tester.inheritancePratice.vehicle.Vehicle;

public class Bike extends Vehicle {
    public String handle;

    public Bike()
    {
        super();
        this.handle="short";
    }
    public Bike(String engine, int wheels, int seats, int fuelTank, String lights, String handle) {
        super(engine, wheels, seats, fuelTank, lights);
        this.handle = handle;
    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        String r=new Vehicle().toString();
        return r +
                "  Bike{" +
                "handle='" + handle + '\'' +
                '}';
    }
}
