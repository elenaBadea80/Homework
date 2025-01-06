
package dip;

import solid.dip.notifier.Notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void sendMessageNotifier(String message) {
        System.out.println("Email sent: " + message);
    }
}


//public void sendEmail(String message) {
//    System.out.println("Email sent: " + message);