package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Lieu> lieux = new ArrayList<>();
        //on imagine que la liste contient des musee, mairie et restaurants.

        // Sans PATTERN
        for (Lieu lieu : lieux) {
            if (lieu instanceof Restaurant) {
                Restaurant restaurant = (Restaurant) lieu;
                System.out.println("Horaire " + restaurant.getHoraires() + ", prix=" + restaurant.getPrixMoyen());
            } else if (lieu instanceof Mairie) {
                // je l'ignore.
            } else if (lieu instanceof Poste) {
                // je l'ignore.
            } else if (lieu instanceof Musee) {
                Musee musee = (Musee) lieu;
                System.out.println("Horaire " + musee.getHoraires() + ", public=" + musee.getPublicVise());
            }
        }

        //Avec Pattern
        TouristeVisitor visitor = new TouristeVisitor();
        for (Lieu lieu : lieux) {
            lieu.accept(visitor);
        }
    }
}
