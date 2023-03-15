
package javaapplication16;
import javax.swing.*;

public class JavaApplication16 {

 
    public static void main(String[] args) {
        // Create the GUI components
        JTextField inputField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        JLabel resultLabel = new JLabel();

        // Create the panel to hold the components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number: "));
        panel.add(inputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        // Create the JFrame and add the panel to it
        JFrame frame = new JFrame("Palindrome Number Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

        // Add an action listener to the check button
        checkButton.addActionListener(event -> {
            String inputString = inputField.getText();
            if (isPalindrome(inputString)) {
                resultLabel.setText(inputString + " is a palindrome number.");
            } else {
                resultLabel.setText(inputString + " is not a palindrome number.");
            }
        });
    }
       public static boolean isPalindrome(String inputString) {
        int i = 0;
        int j = inputString.length() - 1;
        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
        

