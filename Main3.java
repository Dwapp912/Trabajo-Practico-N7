package trabajo.practicon7;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("--- TP7 - KATA 3: Sueldos con Instanceof ---");
        
        List<EmpleadoBase> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana Sanchez"));
        empleados.add(new EmpleadoTemporal("Juan Diaz"));
        empleados.add(new EmpleadoPlanta("Pedro Gomez"));

        double totalNomina = 0;
        
        for (EmpleadoBase emp : empleados) {
            System.out.print(emp.getNombre());

            if (emp instanceof EmpleadoPlanta) { 
                System.out.print(" (Planta)");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.print(" (Temporal)");
            }
            
            double sueldo = emp.calcularSueldo(emp); 
            System.out.println(", Sueldo: $" + sueldo);
            totalNomina = totalNomina + sueldo;
        }
        
        System.out.println("Nomina total: $" + totalNomina);
    }
}