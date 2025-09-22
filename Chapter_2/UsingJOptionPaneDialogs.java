import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);
            
            if (name == null) {
                JOptionPane.showMessageDialog(null, "You cancelled. Exiting program.");
                System.exit(0);
            }

            Object[] options = {"Yes", "No", "Cancel"};
            int choice = JOptionPane.showOptionDialog(null, "Do you want to proceed?", "Confirmation",
                                                      JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                      null, options, options[0]);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "You cancelled. Exiting program.");
                System.exit(0);
            }
        }
    }
}
