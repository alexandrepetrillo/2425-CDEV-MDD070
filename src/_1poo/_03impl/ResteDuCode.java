package _1poo._03impl;

import _1poo._03impl.notif.NotifierMail;
import _1poo._03impl.notif.NotifierSms;

public class ResteDuCode {
    private boolean notificationMail = true;

    public void enregistrerDocument() {

        //enregistrement du document
        ///...

        //Notification
        if (notificationMail) {
            var notifierMail = new NotifierMail();
            notifierMail.notifier(123);
        } else {
            var notifierSms = new NotifierSms();
            notifierSms.notifier(123);
        }
    }
}
