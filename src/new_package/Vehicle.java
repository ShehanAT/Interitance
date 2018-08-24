package new_package;

public class Vehicle {
    private int currentVelocity;
    private int currentDirection;
    private String color;
    private int weight;

    public Vehicle(String color, int weight) {
        this.currentDirection = 0;
        this.currentVelocity = 0;
        this.color = color;
        this.weight = weight;
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vechile is moving at "+ currentVelocity+" km/h at " + currentDirection+" degrees");
    }
    public void steer(int direction){
        currentDirection += direction;
        System.out.println("Vechile steering at "+direction+" degrees");
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
    public void stop(){
        this.currentVelocity = 0;
        System.out.println("Vechile has stopped");
    }
    public int getCurrentVelocity(){
        return currentVelocity;
    }
    public int getCurrentDirection(){
        return currentDirection;
    }

}
