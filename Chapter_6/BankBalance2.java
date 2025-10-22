import java.util.Scanner;

public class BankBalance2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 100.00;
        final double INTEREST_RATE = 0.03;
        int year = 0;
        int choice = 1;
        
        
        System.out.println("Starting Balance: $" + String.format("%.2f", balance));
        System.out.println("Fixed Annual Interest Rate: " + (INTEREST_RATE * 100) + "%");
        System.out.println("-------------------------------------------------------");

        do {
            year++; 
            balance = balance * (1 + INTEREST_RATE);

            System.out.println("After year " + year + " at " + INTEREST_RATE + " interest rate, balance is $" + String.format("%.4f", balance));

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("or any other number for no >> ");
            
            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                choice = 0; 
                scanner.next(); 
            }

        } while (choice == 1); 

        scanner.close();
        System.out.println("\n--- jGRASP: Operation complete.");
    }
}