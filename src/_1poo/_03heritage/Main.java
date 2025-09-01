package _1poo._03heritage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant();
        Professeur professeur = new Professeur();
        PersonnelAdministratif personnelAdministratif = new PersonnelAdministratif();

        etudiant.getNom();
        professeur.getNom();

        List<Personne> list = new ArrayList<>();
        list.add(etudiant);
        list.add(professeur);
        list.add(personnelAdministratif);

        for (Personne personne : list) {
            personne.getNom();

            //personne.getSpecialite();

            if (personne instanceof Professeur) {
                Professeur professeur2 = (Professeur) personne;
                professeur2.getSpecialite();
            }
            if (personne instanceof Etudiant) {
            }
            if (personne instanceof PersonnelAdministratif) {
            }
        }
    }
}
