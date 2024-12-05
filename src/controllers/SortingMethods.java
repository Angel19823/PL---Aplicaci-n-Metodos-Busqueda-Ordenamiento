package controllers;

import modelos.Person;

public class SortingMethods {

    public Person[] sortByNameWithBubble(Person[] personas) {
        int n = personas.length;
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < n; j++) {
                if (personas[i].getName().compareTo(personas[j].getName()) > 0) {
                    Person aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;
                }
            }
        }
        System.out.println("Ördeado por burbuja: ");
        for (Person person : personas) {
            System.out.println(person);
        }
        return personas;
    }

    public Person[] sortByNameWithSelection(Person[] personas) {
        int tamanio = personas.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getName().compareTo(personas[indice].getName()) < 0) {
                    indice = j;
                }
            }
            Person aux = personas[indice];
            personas[indice] = personas[i];
            personas[i] = aux;
        }
        System.out.println("Ördeado por Seleccion: ");
        for (Person person : personas) {
            System.out.println(person);
        }
        return personas;
    }

     public Person[] sortByAgeWithBubble(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = 0; j < tamanio - 1 - i; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Person aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
        System.out.println("Ördeado por burbuja: ");
        for (Person person : personas) {
            System.out.println(person);
        }
        return personas;
    }
    public Person[] sortByAgeWithSelection(Person[] personas) {
        int tamanio = personas.length;
        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (personas[j].getEdad() < personas[indice].getEdad()) {
                    indice = j;
                }
            }
            Person aux = personas[indice];
            personas[indice] = personas[i];
            personas[i] = aux;
        }
        System.out.println("Ördeado por Seleccion: ");
        for (Person person : personas) {
            System.out.println(person);
        }
        return personas;
    }
}
