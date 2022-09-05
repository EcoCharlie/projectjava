package abstr;

import abstr.figure.Circle;

public class AplicationAbs {
    public static void main(String[] arg) {
        Circle circle = new Circle("bue light", 7.52);

        circle.getColor();

        System.out.println("Area: " + circle.Area()); 
        
    }
}
