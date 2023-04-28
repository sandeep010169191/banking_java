import java.util.*;

public class test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter First Name: ");
        String customerFirstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String customerLastName = sc.nextLine();

        showCustomer(customerFirstName, customerLastName);

        System.out.println("How much amount would you like to deposit Mr." + customerFirstName + "?");
        double depositAmount = sc.nextInt();

        amountToBeDeposited(depositAmount);
    }

    public static void showCustomer(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName);
    }

    public static void amountToBeDeposited(double amount) {
        if (amount >= 100000) {
            System.out.println("You can't deposit more than 100,000 without PAN Card");
            System.out.println("Enter your PAN Card Number: ");

            int checkPanValid = showPanCard();
            if (checkPanValid == 1) {
                System.out.println("You have entered a valid PAN Card and " + amount + " rupees has been deposited.");
            } else {
                System.out.println("You have entered an invalid PAN Card and " + amount + " rupees cannot be deposited.");
            }
        } else {
            System.out.println("You have deposited " + amount + " rupees");
        }
    }

    public static int showPanCard() {
        String panCard = sc.nextLine();
        int valid = checkValidPanCard(panCard);
        return valid;
    }

    public static int checkValidPanCard(String pan) {
        if (pan.length() == 10) {
            System.out.println("Valid PAN Card");
            return 1;
        } else {
            System.out.println("Invalid PAN Card");
            return 0;
        }
    }
}
