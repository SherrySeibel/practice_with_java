import java.util.Random;
import java.util.Scanner;
   
public class Die {
  
   private int toss;
  
   public Die(int t) {
      toss = t;
   }  
  
   public int getValue() n{
      return toss;
   }
  
   public void roll() {
      Random randomNumbers = new Random();
      toss = randomNumbers.nextInt(6) + 1;  
   }    
}  


class DieDemo {
   public static void main (String[] args) { 
           
      int roll1 = 0;
      int roll2 = 0;
           
      Die a = new Die(roll1);
      Die b = new Die(roll2);
           
      a.roll();
      b.roll();
           
      roll1 = a.getValue();
      roll2 = b.getValue();
           
      System.out.println("Die A: " + roll1);   
      System.out.println("Die B: " + roll2);                
   }
        
} 