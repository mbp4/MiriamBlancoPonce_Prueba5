package CompositeRestaurante;

public class RestauranteIndividual implements Componente{
    private String nombre;

    public RestauranteIndividual(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void nombre() {
        System.out.println("RESTAURANTE INDIVIDUAL: " + nombre);
    }
}
