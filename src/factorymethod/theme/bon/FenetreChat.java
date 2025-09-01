package factorymethod.theme.bon;

public abstract class FenetreChat {

    private Bouton boutonSend;
    private Bouton boutonClose;

    public void initFenetre() {
        boutonSend = creerBouton();
        boutonClose = creerBouton();
    }

    public abstract Bouton creerBouton();
}
