package new_package;

public class Civic extends Car{
    private int roadServiceMonths;

    public Civic(int roadServiceMonths){
        super("black", 3000, 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public Civic(String color, int weight, int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("black", 3000, 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
        }else if(newVelocity > 40 && newVelocity <= 50){
            changeGear(5);
        }else if(newVelocity > 50){
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

