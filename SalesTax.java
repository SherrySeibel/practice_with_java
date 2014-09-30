/* Write a program that will ask the user to enter the amount
of a purchase. The program should then compute the state
and county sales tax. Assume the state sales tax is 4% and the county
sales tax is 2%. The program should display the amount of the
purchase, the state sales tax, the county sales tax, the total sales tax,
tax, and the total amount of the sale. */

import java.util.Scanner;

public class SalesTax {
   public static void main (String[] args) {
   
      double originalSale; 
      double salesTax = .04;
      double countySalesTax = .02; 
     
               
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How much does your item cost? $ ");
      originalSale = keyboard.nextDouble(); 
      
      double salesTaxed = originalSale * salesTax;
      double countyTaxed = originalSale * countySalesTax;
      double taxTotal = salesTaxed + countyTaxed;
      double saleTotal = originalSale + taxTotal;
      
      System.out.printf("The state sales tax for your item is $%,.2f\n", salesTaxed);         
      System.out.printf("The county sales tax for your item is $%,.2f\n", countyTaxed);
      System.out.printf("The total tax for your item is $%,.2f\n", taxTotal);
      System.out.printf("Your item cost including taxes is $%,.2f\n", saleTotal);
   }
}