package trabajo.practicon7;

public class EmpleadoBase {
    protected String nombre;

    public EmpleadoBase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSueldo(EmpleadoBase e) {
        if (e instanceof EmpleadoPlanta) {
            return 900000.0;
        } else if (e instanceof EmpleadoTemporal) {
            return 850000.0;
        } else {
            return 0.0;
        }
    }
}