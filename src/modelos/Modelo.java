package modelos;

public class Modelo {
    String name;
    int edad;
    public Modelo(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Modelo [name=" + name + ", edad=" + edad + "]";
    }
    
    
}
