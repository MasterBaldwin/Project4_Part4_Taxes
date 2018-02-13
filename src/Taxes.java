import javax.swing.*;
import java.text.DecimalFormat;

public class Taxes {
// Written by: Mike Baldwin
// Calculates the user's taxes owed using a pre-calculated table

public static void main(String[] args) {
    String incomeString;
    double income, taxes;
    DecimalFormat decFormat;

    decFormat = new DecimalFormat("$###,###.##");
    incomeString = JOptionPane.showInputDialog("Enter your net taxable income");
    income = Double.parseDouble(incomeString);
    taxes = 0;

    if (income < 9325)
        taxes = income * 0.1;
    if (income > 9325 && income < 37950)
        taxes = (9325 * 0.1) + ((income - 9325) * 0.15);
    if (income > 37950 && income < 91900)
        taxes = (9325 * 0.1) + (37950 * 0.15) + ((income - 47275) * 0.25);
    if (income > 91900 && income < 191650)
        taxes = (9325 * 0.1) + (37950 * 0.15) + (91900 * 0.25) + ((income - 139175) * 0.28);
    if (income > 191650 && income < 416700)
        taxes = (9325 * 0.1) + (37950 * 0.15) + (91900 * 0.25) + (191650 * 0.28) + ((income - 330825) * 0.33);
    if (income > 416700 && income < 418400)
        taxes = (9325 * 0.1) + (37950 * 0.15) + (91900 * 0.25) + (191650 * 0.28) + (416700 * 0.33) + ((income - 747525) * 0.35);
    if (income > 418400)
        taxes = (9325 * 0.1) + (37950 * 0.15) + (91900 * 0.25) + (191650 * 0.28) + (416700 * 0.33) + (418400 * 0.35) + ((income - 1165925) * 0.396);

    JOptionPane.showMessageDialog(null, "Your 2014 tax is " + decFormat.format(taxes));
}
}
