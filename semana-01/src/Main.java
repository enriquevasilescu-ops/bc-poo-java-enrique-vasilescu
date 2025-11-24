package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RESTAURANTE DE COMIDA ITALIANA ===\n");
        Client cli1 = new Client("Fabian Guerrero", "Cl. 68 sur", "321568744", "C001");
        Client cli2 = new Client("Nicolas Duran", "Cl. 65j sur", "310987428", "C002");

        Pizza piz1 = new Pizza("Carnes", "Pepperoni", "P001");
        Pizza piz2 = new Pizza("Hawaiana", "Piña", "P002");

        System.out.println("--- CLIENTES ---");
        cli1.mostrarDatos();
        cli1.setCodigoPizza();

        System.out.println();
        cli2.mostrarDatos();
        cli2.setDireccion();
        cli2.setTelefono();

        System.out.println("--- PIZZAS ---");
        piz1.mostrarInformacion();
        System.out.println("\nCosto total: $" + piz1.getPrice());

        System.out.println();
        piz2.mostrarInformacion();
        piz2.setdisponible(false);
        System.out.println("\n--- Despues de acabarce ---");
        piz2.mostrarInformacion();
        piz2.getIngredients();
    }
}