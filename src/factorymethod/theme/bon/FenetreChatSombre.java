package factorymethod.theme.bon;

public class FenetreChatSombre extends FenetreChat {
    @Override
    public Bouton creerBouton() {
        return new BoutonSombre();
    }
}
