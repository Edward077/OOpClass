package com.Edward;

public class MyCar {

    // create a full speed method

    public void fullSpeed(){
        System.out.println("The car is running faster as expected");
    }
    public void speed(int speed){
        System.out.println("It speed is km/h = " +speed);
    }

    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.fullSpeed();
        car.speed(400);
    }
}
