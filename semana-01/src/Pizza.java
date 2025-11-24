package src;

public class Pizza {
    private String name;
    private String ingredients;
    private String codePizza;
    private double price;
    private boolean available;

    public Pizza(String name, String ingredients, String codePizza) {
        this.name = name;
        this.ingredients = ingredients;
        this.codePizza = codePizza;
        this.price = price;
        this.available = true;
    }
    public void mostrarInformacion() {
        System.out.println("=== PIZZA ===");
        System.out.println("Nombre: " + name);
        System.out.println("Ingredientes: " + ingredients);
        System.out.println("Codigo: " + codePizza);
        System.out.println("Precio: " + price);
        System.out.println("Disponible: " + (available ? "SI" : "NO"));
    }
    public double getPrice() {

        return price * 3.36;
    }
    public String getIngredients() {

        return ingredients;
    }
    public void setdisponible(boolean disponible) {

        this.available = disponible;
    }
}
