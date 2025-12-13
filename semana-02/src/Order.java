import src.Client;
import src.Pizza;

public class Order {
    private Client client;
    private Drink drink;
    private String code;
    private Pizza pizza;
    private int numberServings;
    private final int total;

    public Order(Client client, Pizza pizza,  Drink drink, String code) {
        this.client = client;
        this.drink = drink;
        this.code = code;
        this.pizza = pizza;
        this.numberServings = 0;
        this.total = 0;
    }

    public double calcularTotal() {
        return pizza.calcularCostoTotal() * numberServings;
    }

    public String obtenerInformacion(){
        return client + ", " + pizza + ", " + drink + " - $" + total;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getNumberServings() {
        return numberServings;
    }

    public void setNumberServings(int numberServings) {
        this.numberServings = numberServings;
    }
}