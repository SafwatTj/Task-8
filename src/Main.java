import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Wählen Sie eine Versandmethode:");
        System.out.println("1 - DHL");
        System.out.println("2 - E-Mail");
        System.out.println("3 - Eule");

        int choice = scanner.nextInt();

        MailDeliveryService service;

        switch (choice) {
            case 1:
                service = new DHL();
                break;
            case 2:
                service = new Email();
                break;
            case 3:
                service = new Owl();
                break;
            default:
                System.out.println("Ungültige Auswahl.");
                return;
        }

        sender.send(service);  // Senden der Post mit der ausgewählten Methode
    }
}



