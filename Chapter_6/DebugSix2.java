import java.util.Scanner;

public class DebugSix2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Unicode value to start (e.g., 65 for A): ");
        int start = input.nextInt();

        final int END = 122;
        final int PER_LINE = 20;
        int count = 0;

        for (int code = start; code <= END; code++) {
            char ch = (char) code;
            System.out.print(ch + " ");
            count++;

            if (count % PER_LINE == 0) {
                System.out.println();
            }
        }

        System.out.println("\nEnd of application");
        input.close();
    }
}