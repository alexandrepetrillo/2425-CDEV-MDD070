package _1poo._03impl;

import _1poo._03impl.notif.Notifier;

public class ResteDuCode2 {

    private Notifier notifier;

    public void enregistrerDocument() {

        //enregistrement du document
        ///...

        //Notification
        notifier.notifier(123);
    }

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
}
