package com.pbo;

public class Bicycle extends Vehicle {

    private int myGearCount;

    Bicycle() {
        System.out.println("Bicycle");
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
}
