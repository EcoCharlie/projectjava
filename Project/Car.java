package Project;

public class Car implements Wheel {

    private int weight;

    public Car() {
        this.weight = plate;
    }

    public void stop() {
        System.out.println("Go Car with plate." + plate);
    }

    public void go() {
        System.out.println("Stop Car with weight: " + weight); 
    }

}
