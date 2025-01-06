package dip;

import solid.dip.notifier.Notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void sendMessageNotifier(String message) {
        System.out.println("Sms sent: " + message);
    }
}

//    public void sendSms(String message) {
//        System.out.println("Sms sent: " + message);
//    }

