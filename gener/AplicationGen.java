package gener;

import java.util.LinkedList;
import java.util.Scanner;

import gener.test.Element;

public class AplicationGen {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //Clase nativa de un Generic
        LinkedList<String> listFruit= new  LinkedList<>();
        System.out.println("Ingresar valor: ");
        listFruit.add(scaner.nextLine());
        String txt = listFruit.getFirst();
        System.out.println(txt);
        //Generic creado por mi
        Element<String> element = new Element<>();
        element.setDato("yei");
        System.out.println(element.getDato());

    }
}
