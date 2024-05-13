package FactoryRestaurante;


public class RestauranteFactory implements Factory {
    @Override
    public Restaurante getRestaurante(String restaurante) {
        if (restaurante.equalsIgnoreCase("tematico")){
            return new TematicoRestaurante();
        } else if (restaurante.equalsIgnoreCase("rapido")) {
            return new TematicoRestaurante();
        } else if (restaurante.equalsIgnoreCase("lujo")) {
            return new LujoRestaurante();
        } else {
            return null;
        }
    }
}
