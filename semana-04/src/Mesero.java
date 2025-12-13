public class Mesero extends Empleado {
    private int propinas;

    public Mesero(String name, String document, String baseSalary, String number, String tips){
        super(name, document, baseSalary, number);
        this.propinas = tips;
    }

    @Override
    public double calcularSalario() {
        double tips = baseSalary * 1 * propinas;
        return baseSalary + tips;
    }
}