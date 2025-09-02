package decorator.notifier;

public class FacebookNotifierDecorator extends AbstractNotifierDecorator {

    public FacebookNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifier(int utilisateurId) {
        sendNotificationFacebook(utilisateurId);
        super.notifier(utilisateurId);
    }

    private void sendNotificationFacebook(int utilisateurId) {
        // non implémenter dans l'exemple
    }
}
