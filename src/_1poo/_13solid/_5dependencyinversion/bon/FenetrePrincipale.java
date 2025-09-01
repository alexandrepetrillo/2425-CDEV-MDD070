package _1poo._13solid._5dependencyinversion.bon;

public class FenetrePrincipale {

    private ServiceEnregistement serviceEnregistement;

    public FenetrePrincipale(ServiceEnregistement serviceEnregistement) {
        this.serviceEnregistement = serviceEnregistement;
    }

    public void clickBoutonEnregistrer() {
        serviceEnregistement.enregistrer();
    }


}
