public class Client {
    private String name;
    private String phone;
    private String addres;
    private String code;
    private int codePizza;

    public Client(String nombre, String direccion, String telefono, String codigo){
        this.name = nombre;
        this.phone = telefono;
        this.addres = direccion;
        this.code = codigo;
        this.codePizza = codePizza;
    }

    public Client(String name, String code) {
        this(name, code, "Sin telefono", "Sin direccion");
    }

    public Client(String code) {
        this(code, code.toLowerCase() + "Ejemplo001");
    }

    public void mostrarDatos(){
        System.out.println("Cliente " + name);
        System.out.println("Telefono " + phone);
        System.out.println("Direccion " + addres);
        System.out.println("Codigo " + code);
        System.out.println("Pizza " + codePizza);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public String getCode() {
        return code;
    }

    public int getCodePizza() {
        return codePizza;
    }

    public String setDireccion() {
        return addres;
    }

    public String setTelefono() {
        return phone;
    }

    public int setCodigoPizza() {
        return codePizza;
    }

    public void setAddres(String addres) {
        if (addres == null || !addres.contains("Cl")) {
            throw new IllegalArgumentException("Direccion invalida");
        }
        this.addres = addres;
    }

    private boolean validarcodigo(String code) {
        return code != null && code.length() >= 4;
    }
}