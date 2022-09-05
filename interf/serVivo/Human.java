package interf.serVivo;

public class Human implements Actions, Data {

    public void eat() {
        System.out.println("Im eating soup");
    }

    public void speak() {
        System.out.println("Im speaking with Juan");
    }

    public void avgLife() {
        System.out.println("My avegare life is 70 year");
    }
    
}
