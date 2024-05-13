package CompositeRestaurante;

public class Main {

    public static void main(String[] args) {
        RestauranteIndividual restaurante1 = new RestauranteIndividual("VIPS");
        RestauranteIndividual restaurante2 = new RestauranteIndividual("GINOS");

        RestauranteCadena grupo = new RestauranteCadena();
        grupo.añadir(restaurante1);
        grupo.añadir(restaurante2);

        grupo.nombre();

        Reservador sistemaReserva = new Reservador();
        ReservasInterfaz sistema = new ReservaAdapter(sistemaReserva);
        sistema.reservar();

        Actualizador actualizador = new Actualizador();
        Cliente cliente1 = new Cliente("Maria");
        Cliente cliente2 = new Cliente("Juan");

        actualizador.agregarObservador(cliente1);

        actualizador.notificar("Nuevas promociones!");
    }
}
