public class Email implements MailDeliveryService {
    @Override
    public void sendMail() {
        System.out.println("Über das Internet per E-Mail senden.");
    }
}

