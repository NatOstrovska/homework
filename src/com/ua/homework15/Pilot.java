package com.ua.homework15;

public class Pilot extends Person implements Driving {

    String pilotLicense;
    String numberFlightHours;
    String pilotCategory;

    public String getPilotLicense() {
        return pilotLicense;
    }

    public void setPilotLicense(String pilotLicense) {
        this.pilotLicense = pilotLicense;
    }

    public String getNumberFlightHours() {
        return numberFlightHours;
    }

    public void setNumberFlightHours(String numberFlightHours) {
        this.numberFlightHours = numberFlightHours;
    }

    public String getPilotCategory() {
        return pilotCategory;
    }

    public void setPilotCategory(String pilotCategory) {
        this.pilotCategory = pilotCategory;
    }

    @Override
    public void process() {
        System.out.println("1. Put on the safety suit and and equipment");
        System.out.println("2. Enter to car");
        System.out.println("3. Fasten seat belt");
        System.out.println("4. Start engine");
        System.out.println("5. Check all the sensors and communication works ok");
        System.out.println("6. Take steering wheel");
        System.out.println("7. Move to starting position");
        System.out.println("8. Wait until traffic light change to green");
        System.out.println("9. Press gas pedal and good luck");
    }
}
