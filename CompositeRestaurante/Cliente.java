package CompositeRestaurante;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements ActualizadorInterfaz{
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizarInfo(String actualizacion) {
        System.out.println(actualizacion + " actualizacion para el cliente: " + nombre);
    }
}
