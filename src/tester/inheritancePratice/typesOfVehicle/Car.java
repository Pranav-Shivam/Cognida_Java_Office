package tester.inheritancePratice.typesOfVehicle;

import tester.inheritancePratice.vehicle.Vehicle;

public class Car  extends Vehicle {
    public String steering;
    public String musicSystem;
    public String air_conditioner;
    public String fridge;
    public String entertainment_system;

    public Car(String engine, int wheels, int seats, int fuelTank, String lights, String steering, String musicSystem, String air_conditioner, String fridge, String entertainment_system) {
        super(engine, wheels, seats, fuelTank, lights);
        this.steering = steering;
        this.musicSystem = musicSystem;
        this.air_conditioner = air_conditioner;
        this.fridge = fridge;
        this.entertainment_system = entertainment_system;
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

    public String getFridge() {
        return fridge;
    }

    public String getEntertainment_system() {
        return entertainment_system;
    }


    @Override
    public String toString() {
        String r=new Vehicle().toString();
        return r +
                "Car{" +
                "steering='" + steering + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", air_conditioner='" + air_conditioner + '\'' +
                ", fridge='" + fridge + '\'' +
                ", entertainment_system='" + entertainment_system + '\'' +
                '}';
    }
}
