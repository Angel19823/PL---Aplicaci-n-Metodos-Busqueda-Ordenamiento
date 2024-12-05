import controllers.*;


//Profe, la verdad no se que error esta pasando aqui, estuve viendo y no parece ser algo del codigo, no lo supe arreglar

import vistas.view;

public class App {
    public static void main(String[] args) throws Exception {

        //Crear la vista
        view vista = new view();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        Controlador controller = new Controlador(vista, sortingMethods, searchMethods);

        controller.start();
    }
}
