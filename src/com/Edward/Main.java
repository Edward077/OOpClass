package com.Edward;

import com.OOP.Car;
import com.OOP.Toyota;
import com.OOP.Vehicle;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Car myCar = new Car(4,2, 45,"Red",2,"white");
        myCar.changeGear(2);
        myCar.getClass();

        Toyota ty = new Toyota(3,1,4,"red",5,"pink,");


    }
}
