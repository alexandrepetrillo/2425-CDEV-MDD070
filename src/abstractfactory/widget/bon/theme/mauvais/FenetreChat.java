package abstractfactory.widget.bon.theme.mauvais;

public class FenetreChat {

    private final String theme; //sombre ou clair

    private History history;
    private Input inputText;
    private Bouton boutonSend;

    public FenetreChat(String theme) {
        this.theme = theme;
    }

    public void initFenetre() {
        if (theme.equalsIgnoreCase("clair")) {
            history = new HistoryClair();
            inputText = new InputClair();
            boutonSend = new BoutonClair();
        } else {
            history = new HistorySombre();
            inputText = new InputSombre();
            boutonSend = new BoutonSombre();
        }
        this.addComponent(history);
        this.addComponent(inputText);
        this.addComponent(boutonSend);
    }

    void addComponent(Component component) {

    }
}
