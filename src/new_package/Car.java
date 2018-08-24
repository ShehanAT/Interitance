package new_package;

import java.sql.SQLOutput;

public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String color, int weight, int wheels, int doors, int gears, boolean isManual) {
        super(color, weight);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = false;
        this.currentGear = 1;

    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear changed to " + this.currentGear + " gear");
    }
    public void changeVelocity(int speed, int direction){
        //any value from parent class cannot be used in methods of the child class

        move(speed, direction);
        System.out.println("Car is moving at "+ speed + " km/h at "+direction + " degrees");
    }
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.currentGear changed to "+ this.currentGear + " gear");
    }


}
