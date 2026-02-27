import javax.swing.JOptionPane;

public class Main{
    public static void main(String [] args){

        double num1;
        double num2;
        char operator;
        double result; // Funny comment here
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
        operator = JOptionPane.showInputDialog("Enter the operator (+, -, *, /): ").charAt(0);

        switch(operator){
            case '+' -> {
                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "The result is " + result);
            }
            case '-' -> {
                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "The result is " + result);
            }
            case '*' -> {
                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "The result is " + result);
            }
            case '/' -> {
                result = num1 / num2;
                JOptionPane.showMessageDialog(null, "The result is " + result);
            }
            default -> {
                JOptionPane.showMessageDialog(null, "Invalid Operator!");
            }
        }
    }
}    