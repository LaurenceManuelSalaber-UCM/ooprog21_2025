import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String predefined = "Carmen";
        System.out.print("Enter your name > ");
        String name = kb.nextLine();

        if (name.equals(predefined))
            System.out.println(predefined + " equals " + name);
        else
            System.out.println(predefined + " does not equal " + name);
    }
}
