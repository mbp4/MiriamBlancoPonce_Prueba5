package FactoryRestaurante;

public class RapidoRestaurante implements Restaurante{

    @Override
    public void servir() {
        System.out.println("Hamburguesa con patatas");
    }
}
