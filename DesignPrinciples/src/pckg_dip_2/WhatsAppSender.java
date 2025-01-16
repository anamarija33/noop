package pckg_dip_2;

public class WhatsAppSender implements SenderService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("WhatsApp sent to " + recipient + " with message: " + message);
    }

}
