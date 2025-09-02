package composite.fichier.bon;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements IFile {
    private String nom;
    private List<IFile> ifiles = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public int calculerTaille() {
        int taille = 0;
        for (IFile ifile : ifiles) {
            taille += ifile.calculerTaille();
        }
        return taille;
    }

    public void add(IFile iFile) {
        ifiles.add(iFile);
    }

}
