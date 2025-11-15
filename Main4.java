package trabajo.practicon7;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("--- TP7 - KATA 4: Polimorfismo de Comportamiento ---");
        
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Lassie"));
        animales.add(new Gato("Felix"));
        animales.add(new Animal("Moby", "Ballena"));
        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
        }
    }
}