package abstractfactory.widget.bon.theme.bon;

public class ComponentSombreConcreteFactory extends ComponentAbstractFactory {
    @Override
    History createComponentHistory() {
        return new HistorySombre();
    }

    @Override
    Bouton createComponentBouton() {
        return new BoutonSombre();
    }

    @Override
    Input createComponentInput() {
        return new InputSombre();
    }
}
