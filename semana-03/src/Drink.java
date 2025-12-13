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

    public String getCode() {
        return code;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 0 || size > 1.6) {
            throw new IllegalArgumentException("Size fuera de posesion");
        }
        this.size = size;
    }

    public void setCode(String code) {
        if (code == null) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.code = code;
    }

    private boolean validarcodigo(String code) {
        return code != null && code.length() >= 4;
    }
}