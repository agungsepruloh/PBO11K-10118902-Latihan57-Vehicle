package com.pbo;

public abstract class Vehicle {

    private String myBrand, myModel;

    Vehicle() {

    }

    public String getMyBrand() {
        return myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
