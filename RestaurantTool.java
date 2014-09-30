   /* Write a program that computes tax and tip on a restaurant bill.
 
--This ptogram should ask the user to enter the charge for the meal.
--The tax should be 6.75% of them meal charge.
--The tip should be 15% of the total after adding the tax.
--Display the meal charge, tax amount, and total bill on the screen. */

import javax.swing.JOptionPane;


public class RestaurantTool {
   public static void main (String [] args) {
      String question;
      String answer;
      double mealCost;
      
   
      question = JOptionPane.showInputDialog("How much did your meal cost in dollars? ");
      mealCost = Double.parseDouble(question);
            
      double tax = .0675, tip = .15;
      double mealTax = mealCost * tax;
      double mealTip = mealTax * tip; 
      double totalBill = mealCost + mealTax + mealTip;
      
      
      answer = String.format("Your meal cost is: $%,.2f\n", mealCost)+"\n"
                            + String.format("Your food tax is: $%,.2f\n", mealTax)
                            + String.format("Your tip after tax is: $%,.2f\n", mealTip)
                            + String.format("Your total bill is: $%,.2f\n", (mealCost + mealTax + mealTip));
   
      JOptionPane.showMessageDialog(null, answer);
      System.out.printf(answer);
    
      System.exit(0);     
         
   }
}
