package controllers;

import vistas.view;

import modelos.Person;


public class Controlador {
    private view view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMetods;

    private Person[] personas;

    public  Controlador(view view, SortingMethods sortingMethods, SearchMethods searchMethods){
        this.view=view;
        this.sortingMethods=sortingMethods;
        this.searchMetods=searchMethods;
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
                    view.displayPersons(personas);
                    view.showPersons(personas);
                    view.displayPersons(personas);
                    addPerson();
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    //searchPersonByAge();
                    break;
                case 5:
                    // searchPersonByAge();
                    break;
                case 100:
                    System.out.println("Adios");
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        } while (option!=0);
    }

    
    public void sortPersons(){
        int sortingOption = view.selectorSortingMethod();
        if(sortingOption == 1){
            sortingMethods.sortByNameWithBubble(personas);
        }else if(sortingOption == 2){
            sortingMethods.sortByNameWithSelection(personas);
        }else if(sortingOption == 3){
            sortingMethods.sortByAgeWithBubble(personas);
        }else if(sortingOption == 4){
            sortingMethods.sortByAgeWithSelection(personas);
        }else{
            view.showMessage("Opción no válida");
        }
    }

    public void inputPersons(){
        int numeroPersonas = view.inputInt("Ingrese el numero de personas: ");
        personas = new Person[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson();
        }
    }

    private void addPerson() {

        if(personas == null){
            view.showMessage("No existen personas");
            inputPersons();
        }else{
            int numeroPersonas = view.inputInt("Ingrese el numero de personas a adicionar: ");

            Person[] personasTotal = new Person[personas.length + numeroPersonas];

            for (int i = 0; i < personas.length; i++) {
                personasTotal[i] = personas[i];
            }

            for (int i = personas.length; i < personasTotal.length; i++) {
                personasTotal[i] = view.inputPerson();
            }
            personas = personasTotal;
        }
    }
}
    