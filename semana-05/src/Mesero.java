import java.time.LocalDate;

public class Mesero extends Empleado {
    private String propinas;

    public Mesero(String name, String document, double baseSalary, String number, String tips){
        super(name, document, baseSalary);
        this.propinas = tips;
    }


    @Override
    public double calcularSalario() {
        double valorPropinas = 0;
        try {
            valorPropinas = Double.parseDouble(propinas);
        } catch (NumberFormatException e) {
            System.out.println("Porpinas invalidas. Usando 0.");
        }

        return baseSalary + valorPropinas;
    }

    @Override
    public String getInfo() {
        return "Mesero #" + number +
                " | Nombre: " + name +
                " | Documento: " + document +
                " | Salario Base: $" + baseSalary +
                " | Propinas: $" + propinas +
                " | Salario Total: $" + calcularSalario();
    }
}