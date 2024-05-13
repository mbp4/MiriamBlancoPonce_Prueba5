package CompositeRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Actualizador {
    private List<ActualizadorInterfaz> observadores = new ArrayList<>();

    public void agregarObservador(ActualizadorInterfaz observador) {
        observadores.add(observador);
    }

    public void notificar(String mensaje) {
        for (ActualizadorInterfaz observador : observadores) {
            observador.actualizarInfo(mensaje);
        }
    }
}
