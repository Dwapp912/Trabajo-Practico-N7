package trabajo.practicon7;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("--- TP7 - KATA 2: Polimorfismo Instanceof ---");
        
        List<Figura> figuras = new ArrayList<>();
        
        Figura circulo1 = new Circulo("Circulo Grande", 5.0);
        Figura rectangulo1 = new Rectangulo("Rectangulo Alto", 4.0, 6.0);
        
        figuras.add(circulo1);
        figuras.add(rectangulo1);
        
        for (Figura f : figuras) {
            // Llamamos al metodo de la clase base, pasandole el objeto a si mismo
            f.calcularArea(f);
        }
    }
}