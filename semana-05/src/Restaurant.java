import java.util.ArrayList;

public class Restaurant {
    private ArrayList<Empleado> empleados;

    public  Restaurant() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.obtenerDescripcion());
    }

    public void procesarNomina(Empleado empleado) {
        double salario = empleado.calcularSalario();
        System.out.println("Procesando pago para: " + empleado.getname);
        System.out.println("Salario: $" + salario);
    }

    public void procesarNominaCompleta() {
        System.out.println("\n=== NOMINA MENSUAL ===");
        double total = 0;
        for (Empleado emp : empleados) {
            procesarNomina(emp);
            total += emp.calcularSalario();
            System.out.println("---");
        }
        System.out.println("TOTAL: $" + total);
    }

    public void generarReporte() {
        System.out.println("\n=== REPORTE DE EMPLEADOS ===");
        for (Empleado emp : empleados) {
            System.out.println(emp.obtenerDescripcion());
            System.out.println("Salario: $" + emp.calcularSalario());
        }
    }

    public void procesarNomina() {
    }
}