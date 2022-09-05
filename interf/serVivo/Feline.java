package interf.serVivo;

public class Feline implements Actions, Data {

    public void eat() {
        System.out.println("Im eating meal");
    }

    public void speak() {
        System.out.println("Im quiet");
    }

    public void avgLife() {
        System.out.println("My avegare life is 25 year");
    }
    
}
