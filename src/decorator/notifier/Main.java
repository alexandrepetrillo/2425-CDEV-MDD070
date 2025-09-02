package decorator.notifier;

public class Main {
    public static void main(String[] args) {
        boolean slackEnabled = true;
        boolean fbEnabled = true;

        Application application = new Application();

        Notifier notifier = new EmptyNotifier();
        if (slackEnabled)
            notifier = new SlackNotifierDecorator(notifier);
        if (fbEnabled)
            notifier = new FacebookNotifierDecorator(notifier);
        application.setNotifier(notifier);
    }
}
