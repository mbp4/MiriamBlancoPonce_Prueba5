package CommandRestaurante;

public class Cancelar implements CommandInterfaz{
    @Override
    public void ejecutar() {
        System.out.println("Cancelando todas las acciones anteriores");
    }
}
