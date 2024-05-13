package FactoryRestaurante;

public class TematicoRestaurante implements Restaurante{

    @Override
    public void servir() {
        System.out.println("Tortilla de Micky Mouse");
    }
}
