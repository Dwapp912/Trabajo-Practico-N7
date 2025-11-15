package trabajo.practicon7;

public class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void hacerSonido() {
        System.out.println("--- sonando ---");
    }
    
    public void describirAnimal() {
        System.out.println("Soy un " + especie + " llamado " + nombre);
    }
}