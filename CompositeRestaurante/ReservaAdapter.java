package CompositeRestaurante;

public class ReservaAdapter implements ReservasInterfaz{
    private Reservador reservador;

    public ReservaAdapter(Reservador reservador) {
        this.reservador = reservador;
    }

    @Override
    public void reservar() {
        reservador.reservarMesa();
    }
}
