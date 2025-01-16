package pckg_dip_2;

public class EmailSender implements SenderService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }

}
