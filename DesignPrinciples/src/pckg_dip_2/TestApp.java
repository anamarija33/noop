package pckg_dip_2;

public class TestApp {
    private static NotificationService newNotificationService;

    public static void main(String[] args)  {
        NotifyManager notifyManager = new NotifyManager();
        NotificationService notificationService = new NotificationService(new SMSSender());
        NotificationService notificationService1 = new NotificationService(new EmailSender());
        NotificationService notificationService2 = new NotificationService(new WhatsAppSender());

        notifyManager.addNewNotificationService(notificationService);
        notifyManager.addNewNotificationService(notificationService1);
        notifyManager.addNewNotificationService(notificationService2);
        notifyManager.addNewNotificationService(newNotificationService);

        notifyManager.notifyWithAll("Hello", "John");
    }
}
