package interf;

import interf.serVivo.Feline;
import interf.serVivo.Human;
import interf.transport.Car;

public class AplicationInt {
    public static void main(String[] args) {
        Car car = new Car();
        car.stop();
        car.go();

        Human man = new Human();
        Feline cat = new Feline();
        man.eat();
        cat.eat();



    }
}