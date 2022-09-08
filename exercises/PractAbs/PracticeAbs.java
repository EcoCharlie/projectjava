package exercises.PractAbs;

import java.util.Scanner;

public class PracticeAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group();
        Double mount; 
        Character nameGroup = 'a';

       
        while(true) {
            System.out
            .println("Ingresar el grupo del cliente (Write X to exit): ");
            nameGroup = Character.toUpperCase(scanner.next().charAt(0));

            if(nameGroup == 'X') {
                System.out.println("Bye");
                break; 
            }
//12345678//12345678//12345678//12345678//12345678//12345678//12345678//12345678
            System.out.println("Ingresar el monto total comprado: ");
            mount = scanner.nextDouble();
            group.setMount(mount);
            group.setNameGroup(nameGroup);
            System.out.println("\nEl Descuento es : " + group.getDiscount() +
            "% y el pago total es " +  group.getTotal());
        }
        
    }
}