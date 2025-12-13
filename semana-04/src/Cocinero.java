public class Cocinero extends Empleado {
    private int añosAntiguedad;

    public Cocinero(String name, String document, String salary, String number, String años) {
        super(name, document, salary, number);
        this.añosAntiguedad = años;
    }

    @Override
    public double calcularSalario() {
        double bono = baseSalary * 0.08 * añosAntiguedad;
        return baseSalary + bono;
    }
}