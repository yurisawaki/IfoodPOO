public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Pizzaria Dominos");

        // Criando e adicionando itens ao restaurante
        PratoPrincipal pizza = new PratoPrincipal("Pizza Margherita", 29.99, "Pizza com molho de tomate, mussarela e manjericão.");
        Bebidas suco = new Bebidas("Suco de Laranja", 7.50, "Suco natural de laranja.");
        Sobremesa bolo = new Sobremesa("Bolo de Chocolate", 12.00, "Bolo com cobertura de chocolate.");

        restaurante.adicionarItem(pizza);
        restaurante.adicionarItem(suco);
        restaurante.adicionarItem(bolo);

        // Exibindo o menu do restaurante
        restaurante.exibirMenu();
    }
}
