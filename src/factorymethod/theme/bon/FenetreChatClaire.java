package factorymethod.theme.bon;

public class FenetreChatClaire extends FenetreChat {
    @Override
    public Bouton creerBouton() {
        return new BoutonClair();
    }
}
