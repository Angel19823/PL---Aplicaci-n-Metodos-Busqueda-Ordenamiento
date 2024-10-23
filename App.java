import java.lang.ModuleLayer.Controller;

import javax.swing.text.View;

import controllers.*;

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
