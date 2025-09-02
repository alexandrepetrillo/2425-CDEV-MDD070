package decorator.notifier;

public class SlackNotifierDecorator extends AbstractNotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notifier(int utilisateurId) {
        sendNotificationSlack(utilisateurId);
        super.notifier(utilisateurId);
    }

    private void sendNotificationSlack(int utilisateurId) {
        // non implémenter dans l'exemple
    }
}
