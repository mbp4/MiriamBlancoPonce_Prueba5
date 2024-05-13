package FactoryRestaurante;

public class Gestor{
    public static Gestor gestor;

    public Gestor() {

    }
    public static synchronized Gestor getInstance() {
        if (gestor == null) {
            gestor = new Gestor();
        }
        return gestor;
    }

    public void gestion(){
        System.out.println("Gestionando los restaurantes");
    }
}
