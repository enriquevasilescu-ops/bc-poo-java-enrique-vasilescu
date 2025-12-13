

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
    public void mostrarDatos(){
        System.out.println("Cliente " + name);
        System.out.println("Telefono " + phone);
        System.out.println("Direccion " + addres);
        System.out.println("Codigo " + code);
        System.out.println("Pizza " + codePizza);
    }

    public String getAddres() {
        return addres;
    }

    public String getPhone() {
        return phone;
    }

    public int getCodePizza() {
        return codePizza;
    }

    public String getCode() {
        return code;
    }
}