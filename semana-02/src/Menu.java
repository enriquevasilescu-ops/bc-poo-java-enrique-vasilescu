import src.Pizza;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<Pizza> pizzas;
    private ArrayList<Drink> drinks;

    public Menu(String name) {
        this.name = name;
        this.pizzas = new ArrayList<>();
        this.drinks = new ArrayList<>();
    }

    public void agrergarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void mostrarTodasPizzas() {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.obtenerInformacion());
        }
    }

    public int contarPizzas() {
        return pizzas.size();
    }

    public void agregarBebidas(Drink drink) {
        drinks.add(drink);
    }

    public void mostrarTodasBebidas() {
        for (Drink drink : drinks) {
            System.out.println(drink.obtnerInformacion());
        }
    }

    public int contarBebidas() {
        return drinks.size();
    }
}