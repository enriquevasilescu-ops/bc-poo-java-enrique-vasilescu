public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Mesero("Jordan", "1013568994", "1400000", "3215619948", "100000");
        empleados[1] = new Cocinero("Farid", "101546792", "2500000", "3154025489", "5");
        empleados[2] = new Mesero("Larry", "1012123165", "1400000", "3116049984", "60000");

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            System.out.println("Salario: $" + emp.calcularSalario());
            System.out.println("---");
        }
    }
}