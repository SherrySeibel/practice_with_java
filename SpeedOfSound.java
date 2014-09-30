
/* 
The following table shows the approximite speed of sound
in air, water, and steel. 

 Medium     Speed
============================
 Air        1,100 ft/second        
 Water      4,900 ft/second        
 Steel     16,400 ft/second
 
 Design a class that stores in a distance field
 that stores distance, in feet, traveled by a sound wave. 
 The class should have the appropriate accessor and mutator methods
 for this field. In addition, the class should have the following methods: 
 
 *getSpeedAir
 
 Time = distance/1100
 
 *getSpeedInWater
 
 Time = distance/4900
 
 *getSpeedInSteel 
 
 Time = distance/16400
 
 Write a program that displays a menu
 allowing the user to select air, water, or steel.
 Once selected, the user should input the distance 
 the sound wave should travel. The program displays
 the amoount of time it should take in the selected medium.
*/ 

import java.util.Scanner;
import java.text.DecimalFormat;

public class SpeedOfSound {

   private double distance;
   private double time;
   
   public SpeedOfSound(double dis, double tim) {  
      distance = dis;
      time = tim;  
   }
   
   public double getDistance() { 
      return distance;
   }
   
   public double getTime() {
      return time;
   }
   
   public double getSpeedInAir() {
      return time = distance/1100;
   }
   
   public double getSpeedInWater() {  
      return time = distance/4900;
   }
  
   public double getSpeedInSteel() {
      return time = distance/16400;
   }
}

class SpeedOfSoundDemo {
   
   public static void main (String[] args) {
   
      double distance;
      double time = 0;
      int selection;
      
     
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What was the distance traveled in feet? ");
      distance = keyboard.nextDouble();        
      
      
      SpeedOfSound speed = new SpeedOfSound(distance, time);
      DecimalFormat formatter = new DecimalFormat("#0.00000");
      
      System.out.print("Please select 1 for air, 2 for water, "
                        + "and 3 for steel: ");
      selection = keyboard.nextInt();
      
      switch (selection) {
         case 1: 
            time = speed.getSpeedInAir();
            System.out.println("The time took approximately " 
                              + formatter.format(time) + " seconds.");
            break;
            
         case 2: 
            time = speed.getSpeedInWater();
            System.out.println("The time took approximately " 
                              + formatter.format(time) + " seconds.");
            break;
                        
         case 3:
            time = speed.getSpeedInSteel();
            System.out.println("The time took approximately " 
                              + formatter.format(time) + " seconds.");
            break;
            
         default:
            System.out.println("You made an invalid choice.");        
      }
   }
}