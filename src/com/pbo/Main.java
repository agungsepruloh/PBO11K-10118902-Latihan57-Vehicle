package com.pbo;

public class Main {

    public static void main(String[] args) {
	    Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand\t : ".concat(bicycle.getMyBrand()));
        System.out.println("Model\t : ".concat(bicycle.getMyModel()));
        System.out.println("Jumlah Gear : ".concat(String.valueOf(bicycle.getMyGearCount())));

        System.out.println();
        Skateboard skateboard = new Skateboard();
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        System.out.println("Brand\t : ".concat(skateboard.getMyBrand()));
        System.out.println("Model\t : ".concat(skateboard.getMyModel()));
        System.out.println("Panjangnya Board : ".concat(String.valueOf(skateboard.getMyBoardLength())));
    }
}
