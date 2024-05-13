package FactoryRestaurante;

public class LujoRestaurante implements Restaurante{

    @Override
    public void servir() {
        System.out.println("Caviar con gambones");
    }
}
