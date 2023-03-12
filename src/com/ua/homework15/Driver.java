package com.ua.homework15;

public class Driver extends Person implements Driving {
    String driverLicense;
    String numberDrivingKilometers;
    String drivingCategory;

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getNumberDrivingKilometers() {
        return numberDrivingKilometers;
    }

    public void setNumberDrivingKilometers(String numberDrivingKilometers) {
        this.numberDrivingKilometers = numberDrivingKilometers;
    }

    public String getDrivingCategory() {
        return drivingCategory;
    }

    public void setDrivingCategory(String drivingCategory) {
        this.drivingCategory = drivingCategory;
    }

    @Override
    public void process() {
        System.out.println("1. Open car and seat down");
        System.out.println("2. Fasten seat belt");
        System.out.println("3. Start engine");
        System.out.println("4. Take steering wheel");
        System.out.println("5. change gear to drive mode");
        System.out.println("6. Press gas pedal");

    }
}
