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
    public void mostrarInformacion() {
        System.out.println("=== PIZZA ===");
        System.out.println("Nombre: " + name);
        System.out.println("Ingredientes: " + ingredients);
        System.out.println("Codigo: " + codePizza);
        System.out.println("Precio: " + price);
        System.out.println("Disponible: " + (available ? "SI" : "NO"));
    }
    public int calcularCostoTotal() {

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
}
