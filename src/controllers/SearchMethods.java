package controllers;

import modelos.Person;

public class SearchMethods {
    public Person busquedaBinAge(Person[] personas, int valor){
        int ini= 0;
        int fin= personas.length-1;

        while (ini<=fin) {
            int medio= ini+(fin-ini)/2;

            for (int i = ini; i <= fin; i++) {
                System.out.println(personas[i].getEdad()+"| ");
            }

            if (personas[medio].getEdad()== valor) {
                return personas[medio];
            } else if (personas[medio].getEdad()< valor) {
                ini= medio+1;
            } else {
                fin= medio-1;
            }
        }
        return null;
    }

    public Person busquedaBinName(Person[] personas, String valor){
        int ini= 0;
        int fin= personas.length-1;

        while (ini<= fin) {
            int medio= ini+(fin-ini)/2;

            for (int i = ini; i <= fin; i++) {
                System.out.println(personas[i].getName()+"| ");
            }

            if (personas[medio].getName().compareTo(valor)==0) {
                return personas[medio];
            } else if (personas[medio].getName().compareTo(valor)<0){
                ini= medio+1;
            } else {
                fin= medio-1;
            }
        }
        return null;
    }
}
