
import javax.swing.JOptionPane;

public class E {
    public static void main(String[] args) {
        while (true) {
            // Requesting the user to input a sentence
            String inputSentence = JOptionPane.showInputDialog("Please enter a sentence.");
            if (inputSentence == null) {
                break; // Terminate the program if the user cancels
            }

            // If user types stop (case-insensitive) then exit program
            if (inputSentence.equalsIgnoreCase("Stop")) {
                break;
            }

            // Initialize counters for uppercase 'E' and lowercase 'e' occurrences
            int upperECount = 0;
            int lowerECount = 0;

            // Analyze each character in the input sentence
            for (int i = 0; i < inputSentence.length(); i++) {
                char currentChar = inputSentence.charAt(i);
                if (currentChar == 'E') {
                    upperECount++; // If there is an uppercase 'E', then increment the count of uppercase 'E'
                } else if (currentChar == 'e') {
                    lowerECount++; // If there is a lowercase 'e', then increment the count of lowercase 'e'
                }
            }

            // Display a message box with the counts of lowercase 'e' and uppercase 'E'
            JOptionPane.showMessageDialog(
                    null,
                    "Number of lower case e's: " + lowerECount + "\nNumber of upper case e's: " + upperECount,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
