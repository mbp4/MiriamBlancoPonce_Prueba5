package CommandRestaurante;

public class Mediator implements MediatorInterfaz{
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    public Mediator(Cocina cocina, ServicioCliente servicioCliente, Entrega entrega) {
        this.cocina = cocina;
        this.servicioCliente = servicioCliente;
        this.entrega = entrega;
    }

    @Override
    public void ejecutar() {
        cocina.cocinar();
        servicioCliente.servicio();
        entrega.entrega();
    }
}
