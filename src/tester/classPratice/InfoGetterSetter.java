package tester.classPratice;

import java.util.Date;

public class InfoGetterSetter {
    private String door,engine,driver,driverName;
    private float speed;
    private String nameOfCar;
    private String model;
    private Date dateOfManufactured;
    private double price;
    private int noOfWheels;
    private long noOfUsers;

    public InfoGetterSetter(String door, String engine, String driver, String driverName, float speed, String nameOfCar, String model, Date dateOfManufactured, double price, int noOfWheels, long noOfUsers) {
        this.door = door;
        this.engine = engine;
        this.driver = driver;
        this.driverName = driverName;
        this.speed = speed;
        this.nameOfCar = nameOfCar;
        this.model = model;
        this.dateOfManufactured = dateOfManufactured;
        this.price = price;
        this.noOfWheels = noOfWheels;
        this.noOfUsers = noOfUsers;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getDateOfManufactured() {
        return dateOfManufactured;
    }

    public void setDateOfManufactured(Date dateOfManufactured) {
        this.dateOfManufactured = dateOfManufactured;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public long getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(long noOfUsers) {
        this.noOfUsers = noOfUsers;
    }

    public void setValue(String nm, String mod, Date dt, double cost, int wheels, long usr , String door, String engine, String driver, float speed)
    {
        this.nameOfCar =nm;
        this.model=mod;
        this.dateOfManufactured=dt;
        this.price=cost;
        this.noOfWheels=wheels;
        this.noOfUsers=usr;
        this.door=door;
        this.engine=engine;
        this.driver=driver;
        this.speed=speed;
    }
    public void getValue()
    {
        System.out.println("Name of Vehicle : "+ this.nameOfCar);
        System.out.println("Name of Model: "+ this.model);
        System.out.println("Date of Manufactured: "+ this.dateOfManufactured);
        System.out.println("Price of Vehicle: "+ this.price);
        System.out.println("No of Wheels: "+ this.noOfWheels);
        System.out.println("No. of Customers: "+ this.noOfUsers);
        System.out.println("Name of Diver: "+ this.driverName);
        System.out.println("Status of Diver: "+ this.driver);
        System.out.println("Speed of Car: "+ this.speed);
        System.out.println("Door status of Diver: "+ this.door);


    }
    public boolean isRunning()
    {
        boolean r=false;
        if (driver.equals("belted")) {
            if (door.equals("closed") && engine.equals("started")) {
                if (speed >1.0f) {
                    r=true;
                }
            }
        }
        return r;
    }
}
