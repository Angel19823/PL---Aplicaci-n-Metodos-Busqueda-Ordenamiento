package controllers;

import vistas.view;
import modelos.Modelo;


public class Controlador {
    private view view;
    private SortingMethods sortinhethods;
    private SearchMethods serchMetods;

    private Modelo[] personas;

    public controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods){
        this.view=view;
        this.sortinhethods=sortingMethods;
        this.serchMetods=searchMethods;
        System.out.println("Controller created");
    }
    
    public void start(){
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    addPerson();
                    break;
                case 100:
                    System.out.println("Adios");
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        } while (option!=0);
    }
    

    public void inputPersons(){
        int numeroPersonas = view.inputInt("Ingrese el numero de personas: ");
        personas = new Person(numeroPersonas);
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    private void addPerson() {
        
    }
}
