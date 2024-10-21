import javax.swing.text.View;

public class App {
    public static void main(String[] args) throws Exception {

        //Crear la vista
        View vista = new View();

        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SortingMethods();

        Controller controller = new Controller(vista, sortingMethods, searchMethods);


    }
}
