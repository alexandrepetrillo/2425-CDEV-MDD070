package abstractfactory.widget.bon.theme.bon;

public class FenetreChat {

    private final ComponentAbstractFactory factory;

    private History history;
    private Input inputText;
    private Bouton boutonSend;

    public FenetreChat(ComponentAbstractFactory factory) {
        this.factory = factory;
    }

    public void initFenetre() {
        history = factory.createComponentHistory();
        inputText = factory.createComponentInput();
        boutonSend = factory.createComponentBouton();
        this.addComponent(history);
        this.addComponent(inputText);
        this.addComponent(boutonSend);
    }

    void addComponent(Component component) {

    }
}
