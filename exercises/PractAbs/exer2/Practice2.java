package exercises.PractAbs.exer2;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {
        Character Stop;
        Float value1;
        Float value2;
        Scanner scanner = new Scanner(System.in);
        Operation suma = new Sum();
        Operation res = new Res();

        do {    
            System.out.println("Ingrese el primer valor: ");
            value1 = scanner.nextFloat();

            System.out.println("Ingrese el segundo valor: ");
            value2 = scanner.nextFloat();

            suma.Operar(value1, value2);
            res.Operar(value1, value2);
           
            System.out.println("El valor de la suma es: " + suma.getRespon());
            System.out.println("El valor de la resta es: " + res.getRespon());

            System.out.println("Desea continuar? (X: continue, everykeless: stop");
            Stop = Character.toUpperCase(scanner.next().charAt(0);          ) 
        } while(Stop == 'X');
    
        
    }

}
