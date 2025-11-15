package trabajo.practicon7;

public class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Metodo que usa instanceof para calcular el area de CUALQUIER figura
    public void calcularArea(Figura f) {
        if (f instanceof Circulo) {
            Circulo c = (Circulo) f;
            double area = c.getRadio() * c.getRadio() * 3.14;
            System.out.println("El area del circulo " + c.getNombre() + " es: " + area);
        } else if (f instanceof Rectangulo) {
            Rectangulo r = (Rectangulo) f;
            double area = r.getBase() * r.getAltura();
            System.out.println("El area del rectangulo " + r.getNombre() + " es: " + area);
        }
    }
}