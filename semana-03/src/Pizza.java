public class Pizza {
    private String name;
    private String ingredients;
    private String codePizza;
    private int price;
    private boolean available;

    public Pizza(String name, String ingredients, String codePizza) {
        this.name = name;
        this.ingredients = ingredients;
        this.codePizza = codePizza;
        this.price = 0;
        this.available = true;
    }

    public Pizza(String name, String codePizza) {
        this(name, codePizza, "Sin ingrendients");
    }

    public Pizza(String name) {
        this(name, name.toLowerCase() + "Example001");
    }

    public void mostrarInformacion() {
        System.out.println("=== PIZZA ===");
        System.out.println("Nombre: " + name);
        System.out.println("Ingredientes: " + ingredients);
        System.out.println("Codigo: " + codePizza);
        System.out.println("Precio: " + price);
        System.out.println("Disponible: " + (available ? "SI" : "NO"));
    }
    public double calcularCostoTotal() {

        return price * 8800;
    }
    public String getIngredients() {

        return ingredients;
    }
    public void setdisponible(boolean disponible) {

        this.available = disponible;
    }

    public String obtenerInformacion(){
        return name + ingredients + price;
    }

    public String getName() {
        return name;
    }

    public String getCodePizza() {
        return codePizza;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Precio debe ser positivo");
        }
    }

    private boolean validarCodigo(String codePizza) {
        return codePizza != null && codePizza.length() >= 4;
    }

    public void setCodePizza(String codePizza) {
        if (codePizza == null) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codePizza = name;
    }
}
