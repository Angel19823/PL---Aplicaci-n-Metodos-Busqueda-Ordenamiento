package vistas;

import java.util.Scanner;

public class view {
    private Scanner teclado = new Scanner(System.in);
    public int showMenu(){
        System.out.println("---MENU---");
        System.out.println("Ingrese la persona: ");
        System.out.println("100 salida");
        System.out.println("Ingrese una opcion: ");
        return teclado.nextInt();
    }

    public int inputInt(String message){
        System.out.println(message);
        return teclado.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }
    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        return teclado.nextLine();
    }
    public int inputAge(){
        System.out.println("Ingrese la edad: ");
        return teclado.nextInt();
    }
}
