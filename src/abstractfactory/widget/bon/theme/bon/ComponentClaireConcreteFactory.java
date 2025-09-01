package abstractfactory.widget.bon.theme.bon;

public class ComponentClaireConcreteFactory extends ComponentAbstractFactory {
    @Override
    History createComponentHistory() {
        return new HistoryClair();
    }

    @Override
    Bouton createComponentBouton() {
        return new BoutonClair();
    }

    @Override
    Input createComponentInput() {
        return new InputClair();
    }
}
