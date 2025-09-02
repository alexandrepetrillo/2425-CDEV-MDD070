package decorator.notifier;

public class AbstractNotifierDecorator implements Notifier {
    private Notifier notifier;

    public AbstractNotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void notifier(int utilisateurId) {
        this.notifier.notifier(utilisateurId);
    }

}
