package abstractfactory.widget.bon.theme.bon;

public class Main {
    public static void main(String[] args) {
        new FenetreChat(new ComponentClaireConcreteFactory());
    }
}
