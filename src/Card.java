public class Card {

    // Private attributes
    private final String cardNumber;
    private final double balance;
    private int pin;
    private boolean isActive;

    // Constructor
    public Card(String cardNumber, double balance, int pin, boolean isActive) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.isActive = isActive;
    }

    // Method to update PIN
    public void updatePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("PIN updated successfully.");
        } else {
            System.out.println("Old PIN is incorrect. PIN not updated.");
        }
    }

    // Method to activate card
    public void activateCard() {
        isActive = true;
        System.out.println("Card activated successfully.");
    }

    // Method to mask card number
    private String maskCardNumber() {
        if (cardNumber.length() >= 4) {
            return "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
        } else {
            return "Invalid Card Number";
        }
    }

    // toString method
    public String toString() {
        return "\nCARD DETAILS" +
                "\nCard Number: " + maskCardNumber() +
                "\nBalance: $" + balance +
                "\nPIN: ****" +
                "\nActive: " + isActive;
    }
}