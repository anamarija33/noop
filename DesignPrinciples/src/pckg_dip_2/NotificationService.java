package pckg_dip_2;

public class NotificationService {

    private SenderService senderService;

    public NotificationService(SenderService senderService) {
        this.senderService = senderService;
        System.out.println("NotificationService created - sendeR: " + senderService.getClass().getSimpleName());
    }

    public void notifyWithSender(String message, String recipient) {
        senderService.sendMessage(message, recipient);
    }
}
