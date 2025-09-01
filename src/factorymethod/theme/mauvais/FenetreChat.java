package factorymethod.theme.mauvais;

public class FenetreChat {

    private final String theme; //sombre ou clair

    private Bouton boutonSend;
    private Bouton boutonClose;

    public FenetreChat(String theme) {
        this.theme = theme;
    }

    public void initFenetre() {
        if (theme.equalsIgnoreCase("clair")) {
            boutonSend = new BoutonClair();
            boutonClose = new BoutonClair();
        } else {
            boutonSend = new BoutonSombre();
            boutonClose = new BoutonSombre();
        }

        // créer aussi le input
        // créer le texte area qui contient 'historique
        // creer l'avatar...

        // cabler le bouton send au servie d'envouie du message.
    }
}
