/*Enter your net taxable income: 22000
        Your 2014 tax is $2,833.75*/
/*10% Not over $9,325
  15% $9,325 - $37,950
  25% $37,950– $91,900
  28% $91,900 – $191,650
  33% $191,650 – $416,700
  35% $416,700- $418,400
  39.6 Over $418,400*/

import javax.swing.*;

public class Taxes {
public static void main(String[] args) {
    String incomeString;
    double income, taxes, adjustedIncome;

    incomeString = JOptionPane.showInputDialog("Enter your net taxable income");
    income = Double.parseDouble(incomeString);
    taxes = 0;
    adjustedIncome = income;

    if (income < 9325) {
        taxes += adjustedIncome * 0.1;
        adjustedIncome -= 9325;
    }

    if (income > 9325) {
        taxes += adjustedIncome * 0.1;
        adjustedIncome -= 9325;
        taxes += adjustedIncome * 0.15;
        adjustedIncome -= 37950;
    }
    if (income > 37950) {
        taxes += adjustedIncome * 0.25;
        adjustedIncome -= 91900;
    }
    if (income > 91900 && income < 191650) {
        taxes = (9325 * 0.1) + ((income - 9325) * 0.15) + ((income - 37950) * 0.25) + ((income - 91900) * 0.28);
    }
    if (income > 191650 && income < 416700) {
        taxes = (9325 * 0.1) + ((income - 9325) * 0.15) + ((income - 37950) * 0.25) + ((income - 91900) * 0.28);
    }
    if (income > 416700 && income < 418400) {
        taxes = (9325 * 0.1) + ((income - 9325) * 0.15) + ((income - 37950) * 0.25) + ((income - 91900) * 0.28) + ((income - 416700) * 0.33) + ((income - 416700) * 0.35);
    }
    if (income > 418400) {
        taxes = (9325 * 0.1) + ((income - 9325) * 0.15) + ((income - 37950) * 0.25) + ((income - 91900) * 0.28) + ((income - 416700) * 0.33) + ((income - 416700) * 0.35) + ((income - 416700) * 0.396);
    }

    JOptionPane.showMessageDialog(null, "Your 2014 tax is $" + taxes);
}
}
