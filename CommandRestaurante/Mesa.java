package CommandRestaurante;

public abstract class Mesa {

    private StateInterfaz estado;

    public Mesa() {
        estado = new MesaLibre();
    }

    public void cambiarEstado(StateInterfaz estado) {
        this.estado = estado;
    }

    public void reserva() {
        estado.reservada(this);
    }

    public void ocupada() {
        estado.ocupada(this);
    }

    public void libre() {
        estado.libre(this);
    }
}
