package com.OOP;

public class Car {
 private    int wheels ;
   private int door;
   private int speed;
   private  String color;
   private int gear;
   private  String enginee;

   // Creating defualt constructor

    public Car(int wheels, int door, int speed, String color, int gear, String enginee) {
        this.wheels = wheels;
        this.door = door;
        this.speed = speed;
        this.color = color;
        this.gear = gear;
        this.enginee = enginee;
    }

    // declearing the first method
  public void changeGear(int gear1){ // start block
       this.gear = gear1;
   }// end block code

    // creating the second method
   public void  speedup( int mySpeed){
       this.speed = mySpeed;


    }

}
