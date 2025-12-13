public class Drink {
    private String name;
    private String code;
    private double size;
    private int price;

    public Drink(String name, String code) {
        this.name = name;
        this.code = code;
        this.size = 0;
        this.price = 0;
    }

    public double calcularCostoTotal() {
        return price * 3900;
    }

    public String obtnerInformacion(){
        return name + ", " + size + " - $" + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}