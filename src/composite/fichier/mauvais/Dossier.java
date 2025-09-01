package composite.fichier.mauvais;

import java.util.ArrayList;
import java.util.List;

public class Dossier {
    private String nom;
    private List<Fichier> fichiers = new ArrayList<>();
    private List<Dossier> sousDossiers = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public int calculerTaille() {
        // TODO
        return 0;
    }

    public void add(Fichier fichier) {
        fichiers.add(fichier);
    }

    public void add(Dossier repertoire) {
        sousDossiers.add(repertoire);
    }
}
