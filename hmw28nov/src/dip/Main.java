
package dip;

import solid.dip.notifier.Notifier;

/**
 * Refactor the NotificationService to depend on an abstraction.
 * Implement a new notifier for SMS without changing NotificationService.
 */
public class Main {

    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SmsNotifier();

        NotificationService emailService = new NotificationService(emailNotifier);
        NotificationService smsService = new NotificationService(smsNotifier);

        emailService.notify("Hello, this is an email notification!");
        smsService.notify("Hello, this is a SMS notification!");
    }
}
