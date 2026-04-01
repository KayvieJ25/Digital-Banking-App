import java.util.InputMismatchException;
import java.util.Scanner;

public class OnboardingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            // Collect Client Info
            System.out.println("Enter Client ID:");
            int id = input.nextInt();

            input.nextLine();

            System.out.println("Enter First Name:");
            String firstName = input.nextLine();

            System.out.println("Enter Last Name:");
            String lastName = input.nextLine();

            System.out.println("Enter Age:");
            int age = input.nextInt();

            // Collect Card Info
            input.nextLine();

            System.out.println("Enter Card Number:");
            String cardNumber = input.nextLine();

            System.out.println("Enter Balance:");
            double balance = input.nextDouble();

            System.out.println("Enter PIN:");
            int pin = input.nextInt();

            boolean isActive = false;

            // Create Client object
            Client client = new Client(
                    id, firstName, lastName, age,
                    cardNumber, balance, pin, isActive
            );

            // Display initial profile
            System.out.println(client);

            // Activate Card
            client.activateClientCard();

            // Change PIN
            System.out.println("Enter OLD PIN:");
            int oldPin = input.nextInt();

            System.out.println("Enter NEW PIN:");
            int newPin = input.nextInt();

            client.updateClientPin(oldPin, newPin);

            // Display updated profile
            System.out.println(client);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type entered.");
        }
    }
}