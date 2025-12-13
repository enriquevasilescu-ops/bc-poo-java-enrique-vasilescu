public abstract class Empleado {
    public String getname;
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

    public Empleado(String name, String document, double baseSalary) {
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + name);
        System.out.println("ID: " + document);
        System.out.println("Telefono: " + number);
    }

    public double calcularSalario() {
        return baseSalary;
    }

    public abstract String obtenerDescripcion();

    public abstract String getInfo();
}