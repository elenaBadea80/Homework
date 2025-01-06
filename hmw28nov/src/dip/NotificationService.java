
package dip;

import solid.dip.notifier.Notifier;

public class NotificationService {

    private Notifier notifier;

    public NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    public void notify(String message){
        notifier.sendMessageNotifier(message);
    }
}


//private EmailNotifier emailNotifier = new EmailNotifier();
//public void notify(String message) {
//    emailNotifier.sendEmail(message);