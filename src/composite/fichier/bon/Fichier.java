package composite.fichier.bon;

public class Fichier implements IFile {
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

    @Override
    public int calculerTaille() {
        return taille;
    }
}
