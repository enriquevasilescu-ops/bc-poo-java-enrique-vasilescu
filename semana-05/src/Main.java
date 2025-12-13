import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Mesero emp1 = new Mesero("Billy Orjuela", "10132525249", "1400000", "3514897566", "1");
        Cocinero emp2 = new Cocinero("Sergio Maro", "1015689752", "2500000", "3124995874", "25");
        Mesero emp3 = new Mesero("Jorge Cardona", "10146679812", "1400000", "3214859774", "1");

        restaurant.agregarEmpleado(emp1);
        restaurant.agregarEmpleado(emp2);
        restaurant.agregarEmpleado(emp3);

        restaurant.procesarNomina();

        restaurant.generarReporte();

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);

        System.out.println("\n=== DEMOSTRACION POLIMORFISMO ===");
        for (Empleado e : empleados) {
            System.out.println(e.obtenerDescripcion());
            System.out.println("Salario: $" + e.calcularSalario());
            System.out.println("Tipo real: " + e.getClass().getSimpleName());
            System.out.println("---");
        }
    }
}