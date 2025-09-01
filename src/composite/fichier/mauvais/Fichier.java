package composite.fichier.mauvais;

public class Fichier {
    private String nom;
    private int taille;

    public Fichier(String nom, int taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public int getTaille() {
        return taille;
    }
}
