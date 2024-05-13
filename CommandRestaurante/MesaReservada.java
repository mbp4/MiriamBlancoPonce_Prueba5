package CommandRestaurante;

public class MesaReservada implements StateInterfaz{
    @Override
    public void ocupada(Mesa mesa) {
        System.out.println("La mesa esta ocupada");
        mesa.cambiarEstado(new MesaOcupada());
    }

    @Override
    public void libre(Mesa mesa) {
        System.out.println("La mesa esta libre");
        mesa.cambiarEstado(new MesaLibre());
    }

    @Override
    public void reservada(Mesa mesa) {
        System.out.println("La mesa ya esta reservada");
    }
}
