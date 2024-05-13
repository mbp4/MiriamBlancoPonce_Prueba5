package CommandRestaurante;

public class Main {

    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        Ordenar ordenar = new Ordenar();
        Cancelar cancelar = new Cancelar();

        reserva.ejecutar();
        Mesa mesa = new Mesa();
        mesa.reserva();
        mesa.ocupada();
        ordenar.ejecutar();

        Cocina cocina = new Cocina();
        ServicioCliente servicioCliente = new ServicioCliente();
        Entrega entrega = new Entrega();

        Mediator mediator = new Mediator(cocina, servicioCliente, entrega);
        mediator.ejecutar();
    }
}
