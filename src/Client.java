public class Client {

    // Private attributes
    private final int idNumber;
    private final String firstName;
    private final String lastName;
    private final int age;

    private final Card card; // Composition

    // Constructor with Card creation inside
    public Client(int idNumber,
                  String firstName,
                  String lastName,
                  int age,
                  String cardNumber,
                  double balance,
                  int pin,
                  boolean isActive){

        // Validation
        if(age < 18){
            System.out.println("Client must be 18 or older.");
            System.exit(0);
        }

        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        // Creating Card object INSIDE Client
        this.card = new Card(cardNumber, balance, pin, isActive);
    }

    // Method to activate card
    public void activateClientCard(){
        card.activateCard();
    }

    // Method to update PIN
    public void updateClientPin(int oldPin, int newPin){
        card.updatePin(oldPin, newPin);
    }

    // toString Method
    public String toString(){
        return "\nCLIENT PROFILE" +
                "\nID: " + idNumber +
                "\nName: " + firstName + " " + lastName +
                "\nAge: " + age +
                card.toString();
    }
}

