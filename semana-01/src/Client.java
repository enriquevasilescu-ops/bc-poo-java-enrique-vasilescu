package src;

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

    public String setDireccion() {
        return addres;
    }

    public String setTelefono() {
        return phone;
    }

    public int setCodigoPizza() {
        return codePizza;
    }
}