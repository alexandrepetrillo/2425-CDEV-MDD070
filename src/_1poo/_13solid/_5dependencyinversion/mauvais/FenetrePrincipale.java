package _1poo._13solid._5dependencyinversion.mauvais;

import java.util.Objects;

public class FenetrePrincipale {

    private ServiceEnregistementSql serviceEnregistementSql = new ServiceEnregistementSql();
    private ServiceEnregistementFichier serviceEnregistementFichier = new ServiceEnregistementFichier();

    private String modeEnregistrement = "sql";

    public void clickBoutonEnregistrer() {
        if (Objects.equals(modeEnregistrement, "sql")) {
            serviceEnregistementSql.enregistrer();
        } else {
            serviceEnregistementFichier.enregistrer();
        }
    }

    public void setModeEnregistrement(String modeEnregistrement) {
        this.modeEnregistrement = modeEnregistrement;
    }
}
