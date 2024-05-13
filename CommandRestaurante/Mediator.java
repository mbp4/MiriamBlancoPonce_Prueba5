package CommandRestaurante;

public class Mediator implements MediatorInterfaz{
    private Cocina cocina;
    private ServicioCliente servicioCliente;
    private Entrega entrega;

    @Override
    public void ejecutar() {
        cocina.cocinar();
        servicioCliente.servicio();
        entrega.entrega();
    }
}
