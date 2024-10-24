public class DHL implements MailDeliveryService {

    @Override
    public void sendMail() {
        System.out.println("Lege den Brief in einen Umschlag, klebe eine Briefmarke auf, sende ihn per DHL.");
    }
}
