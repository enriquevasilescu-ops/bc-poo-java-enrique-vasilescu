public class Cocinero extends Empleado {
    private int añosAntiguedad;

    public Cocinero(String name, String document, double salary, int number, int años) {
        super(name, document, salary, number);
        this.añosAntiguedad = años;
    }

    @Override
    public double calcularSalario() {
        double bono = baseSalary * 0.08 * añosAntiguedad;
        return baseSalary + bono;
    }

    @Override
    public String obtenerDescripcion() {
        return "Cocinero:" + name + " (" + añosAntiguedad + "años)";
    }

    public int getAñosAntiguedad() { return añosAntiguedad; }

    @Override
    public String getInfo() {
        return "Cocinero #" + number +
                " | Nombre: " + name +
                " | Documento: " + document +
                " | Salario Base: $" + baseSalary +
                " | Años Antiguedad: " + añosAntiguedad +
                " | Salario Total: $" + calcularSalario();
    }
}