import src.Client;
import src.Pizza;

public class main {
    public static void main(String[] args) {

        Client client1 = new Client("Valeria Navarrete", "Cl. 1B #12-2", "312895471", "C001");
        Pizza pizza1 = new Pizza("Mexicana", "Picante", "P001");
        Drink drink1 = new Drink("CocaCola", "D001");

        Order order1 = new Order(client1, pizza1, drink1, "O001");

        Menu menu = new Menu("Tradicional");
        menu.agrergarPizza(pizza1);
        menu.agregarBebidas(drink1);

        menu.mostrarTodasPizzas();
        System.out.println("Total pizzas: " + menu.contarPizzas());
        menu.mostrarTodasBebidas();
        System.out.println("Total bebidas: " + menu.contarBebidas());
    }
}