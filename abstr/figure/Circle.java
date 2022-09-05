package abstr.figure;

public class Circle extends Figure {

    private double radio;

    public Circle(String color, double r) {
        super(color);
        this.radio = r;
    }

    public double Area() {
        return Math.PI * radio * radio;
    }
    
}
