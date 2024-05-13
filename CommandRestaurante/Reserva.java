package CommandRestaurante;

public class Reserva implements CommandInterfaz{
    @Override
    public void ejecutar() {
        System.out.println("Mesa reservada");
    }
}
