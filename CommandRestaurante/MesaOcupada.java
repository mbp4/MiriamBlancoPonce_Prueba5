package CommandRestaurante;

public class MesaOcupada implements StateInterfaz{
    @Override
    public void ocupada(Mesa mesa) {
        System.out.println("La mesa ya esta ocupada");
    }

    @Override
    public void libre(Mesa mesa) {
        System.out.println("La mesa esta libre");
        mesa.cambiarEstado(new MesaLibre());
    }

    @Override
    public void reservada(Mesa mesa) {
        System.out.println("La mesa esta reservada");
        mesa.cambiarEstado(new MesaReservada());
    }
}
