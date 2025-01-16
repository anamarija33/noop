package pckg_dip_1;

import org.w3c.dom.traversal.NodeIterator;

import javax.management.NotificationFilter;

public class Test {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailSender());
        notificationService.sendNotification("Hello", "World");


        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addNotificationService(notificationService);
        notificationManager.addNotificationService(new NotificationService(new EmailSender()));




    }
}
