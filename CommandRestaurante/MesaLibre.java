package CommandRestaurante;

public class MesaLibre implements StateInterfaz{
    @Override
    public void ocupada(Mesa mesa) {
        System.out.println("La mesa esta ocupada");
        mesa.cambiarEstado(new MesaOcupada());
    }

    @Override
    public void libre(Mesa mesa) {
        System.out.println("La mesa ya esta libre");
    }

    @Override
    public void reservada(Mesa mesa) {
        System.out.println("La mesa esta reservada");
        mesa.cambiarEstado(new MesaReservada());
    }
}
