package CompositeRestaurante;

import java.util.ArrayList;
import java.util.List;

public class RestauranteCadena implements Componente{
    //las cadenas de restaurantes estaran formados por varios resturantes simples

    private List<RestauranteIndividual> restaurantes;

    public RestauranteCadena() {
        this.restaurantes = new ArrayList<>();
    }

    public void añadir(RestauranteIndividual restauranteIndividual){
        restaurantes.add(restauranteIndividual);
    }

    public void borrar(RestauranteIndividual restauranteIndividual){
        restaurantes.remove(restauranteIndividual);
    }

    @Override
    public void nombre() {
        System.out.println("La cadena de resturantes esta formada por: ");
        for (RestauranteIndividual restauranteIndividual: restaurantes){
            restauranteIndividual.nombre();
        }
    }
}
