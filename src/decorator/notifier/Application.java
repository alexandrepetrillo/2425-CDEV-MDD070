package decorator.notifier;


public class Application {
    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void codePrincipal() {
        //.blabla
        notifier.notifier(123);
        //.blabla
    }
}
