package vistas;

import java.util.Scanner;

import modelos.Person;

public class view {
    private Scanner teclado = new Scanner(System.in);
    public int showMenu(){
        System.out.println("---MENU---");
        System.out.println("1. Ingrese la persona: ");
        System.out.println("2. Mostrar personas: ");
        System.out.println("3. Ordenar personas: ");
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
    public void showMessage(String message) {
        System.out.println("LOG" + message);
    }
    public void showPersons(Person[] personas) {
        for (Person persona : personas) {
            System.out.println(persona);
        }
    }
    public void displayPersons(Person[] personas) {
        if (personas == null || personas.length == 0) {
            System.out.println("No hay personas para mostrar.");
            return;
        }
        System.out.println("Lista de personas:");
        for (Person persona : personas) {
            System.out.println(persona); 
        }
    }
    public int selectorSortingMethod() {
        System.out.println("Seleccione el método de ordenamiento:");
        System.out.println("1. Ordenamiento por nombre (Burbuja)");
        System.out.println("2. Ordenamiento por nombre (Selección)");
        System.out.println("3. Ordenamiento por edad (Burbuja)");
        System.out.println("4. Ordenamiento por edad (Selección)");
        System.out.print("Ingrese un método de ordenamiento: ");
        return teclado.nextInt();
    }
    

}
