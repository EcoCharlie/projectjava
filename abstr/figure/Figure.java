package abstr.figure;

public abstract class Figure {

    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println("The figure color is " + this.color);
    }

    public abstract double Area();
}