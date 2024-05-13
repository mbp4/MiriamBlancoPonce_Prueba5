package CommandRestaurante;

public interface StateInterfaz {
    public void ocupada(Mesa mesa);
    public void libre(Mesa mesa);
    public void reservada (Mesa mesa);
}
