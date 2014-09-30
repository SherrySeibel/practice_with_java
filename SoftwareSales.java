
/*
A software company sells a package that retails for $99.
Quantity discounts are given according to the following table: 

Quantity             Discount
-----------------------------
10-19                   20%
20-49                   30% 
50-99                   40% 
100 +                   50%

Design a class that stores the number of units sold
and has a method that returns the total cost of the purchase.
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class SoftwareSales {

   private int unitsSold;
   private double totalCost;
   private int initialCost;
   
   
   
   public SoftwareSales (int units, double tCost, int initial) {
      unitsSold = units;
      totalCost = tCost;         
      initialCost = initial;
   }
   
   public int getUnitsSold() {
      return unitsSold;
   }
   
   public double getTotalCost() {
      return totalCost;
   }  
     
   public double getNoDiscount() {
      return totalCost = initialCost * unitsSold;   
   }
   
   public double getFirstDiscount() {
      return totalCost = initialCost * unitsSold * .80;
   }  
   
   public double getSecondDiscount() {
      return totalCost = initialCost * unitsSold * .70;
   }
   
   public double getThirdDiscount() {
      return totalCost = initialCost * unitsSold * .60;
   }
   
   public double getFourthDiscount() {
      return totalCost = initialCost * unitsSold * .50;
   }
}


class SoftwareSalesDemo {
   public static void main (String[] args) {
      int unitsSold = 0;
      double totalCost = 0.0;
      int initialCost = 99;
       
      Scanner keyboard = new Scanner(System.in);
      System.out.print("How many software packages would you like" 
                        + " to buy? ");
      unitsSold = keyboard.nextInt();
      
          
      SoftwareSales sales = new SoftwareSales(unitsSold, totalCost, initialCost);
      DecimalFormat formatter = new DecimalFormat("#,##0.00");
      
      if (unitsSold < 10) {
         System.out.println("Your total is: $" 
                           + formatter.format(sales.getNoDiscount()));
      } 
      else if(unitsSold >= 10 && unitsSold <= 19) {
         System.out.println("Your total is: $" 
                           + formatter.format(sales.getFirstDiscount()));
      } 
      else if(unitsSold >= 20 && unitsSold <= 49) {
         System.out.println("Your total is: $" 
                           + formatter.format(sales.getSecondDiscount()));
      } 
      else if(unitsSold >= 50 && unitsSold <= 99) {
         System.out.println("Your total is: $" 
                           + formatter.format(sales.getThirdDiscount()));
      } 
      else {
         System.out.println("Your total is: $" 
                           + formatter.format(sales.getFourthDiscount()));
      }
   }
}