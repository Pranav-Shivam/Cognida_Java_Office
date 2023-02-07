package tester.inheritancePratice.typesOfVehicle;

import tester.inheritancePratice.vehicle.Vehicle;

public class Truck extends Vehicle {
    public String steering;
    public String musicSystem;
    public String air_conditioner;
    public int containers;

    public Truck(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String air_conditioner, int containers) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.air_conditioner = air_conditioner;
        this.containers = containers;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getAir_conditioner() {
        return air_conditioner;
    }

    public int getContainers() {
        return containers;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", air_conditioner='" + air_conditioner + '\'' +
                ", containers=" + containers +
                '}';
    }
}
