/* Write a class names RetailItems
that holds data about an item in a retail store.
The class should have the following fields:

   *description
   *unitsOnHand
   *price
   
Write appropriate mutator methods that store values in these fields
and accessor methods that return the value in these fields.
Once you have written the class, write aa separate program
that creates three RetailItem objects and stores the following data in them.

Decription                    Units on hand              Price
_______________________________________________________________

1. Jacket                           12                   $59.95
2. Designer Jeans                   40                   $34.95
3. Shirt                            20                   $24.95

*/

public class RetailItem {

   private String description;
   private int unitsOnHand;
   private double price;
   
   public RetailItem(String item, int stock, double money) {
      description = item;
      unitsOnHand = stock;
      price = money;
   }
   
   public void setDescription(String item) {
      description = item;
   }
   
   public void setUnitsOnHand(int stock) {
      unitsOnHand = stock;
   }
   
   public void setPrice(int money) {
      price = money;
   }
  
   
   public String getDescription() {
      return description;
   }
   
   public int getUntisOnHand() {
      return unitsOnHand;
   }
   
   public double getPrice() {
      return price;
   }  
}

class RetailItemDemo {
   public static void main (String[] args) {
   
      RetailItem item1 = new RetailItem("Jackets", 12, 54.95);
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem("Shirts", 20, 24.95);
      
      System.out.printf("Description \t" 
                        + "  Units on Hand \t \t"
                        + "Price\n");
                        
      System.out.println("______________________________________________________\n");
                        
      System.out.printf(item1.getDescription() + "\t  \t  \t" 
                        +item1.getUntisOnHand() + "\t  \t  \t"
                        + "$" + item1.getPrice()+ "\n");
                        
      System.out.printf(item2.getDescription() + "\t  \t" 
                        +item2.getUntisOnHand() + "\t \t \t"
                        + "$" +item2.getPrice() + "\n");
                        
      System.out.printf(item3.getDescription() + "\t  \t  \t" 
                        +item3.getUntisOnHand() + "\t  \t  \t"
                        + "$" + item3.getPrice());
   
   }
} 
