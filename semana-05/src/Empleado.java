public class Empleado {
    protected String name;
    protected String document;
    protected double baseSalary;
    protected int number;

    public Empleado(String name, String document, double salary, int number) {
        this.name = name;
        this.document = document;
        this.baseSalary = salary;
        this.number = number;
    }

    public Empleado() {
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + name);
        System.out.println("ID: " + document);
        System.out.println("Telefono: " + number);
    }

    public double calcularSalario() {
        return baseSalary;
    }

    public String getInfo() {
        return "Empleado #" + number + " _ " + name +
                " | Documento: " + document +
                " | Salario Base: $" + baseSalary;
    }
}