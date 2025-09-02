package iterator.arbre;

import java.util.ArrayList;
import java.util.List;

public class Arbre {
    private String valeur;
    private List<Arbre> enfants = new ArrayList<>();

    public Arbre(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public List<Arbre> getEnfants() {
        return enfants;
    }

    public void addEnfant(Arbre enfant) {
        enfants.add(enfant);
    }
}