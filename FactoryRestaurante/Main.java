package FactoryRestaurante;

public class Main {

    public static void main(String[] args) {
        RestauranteFactory restauranteFactory = new RestauranteFactory();

        Restaurante restaurante1 = restauranteFactory.getRestaurante("lujo");
        restaurante1.servir();

        StrategyInterfaz estrategia = new StrategyLujo();
        estrategia.gestion();
    }
}
