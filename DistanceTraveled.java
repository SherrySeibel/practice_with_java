import java.util.Scanner;

public class DistanceTraveled {

   double speed;
   double hours;
         
   DistanceTraveled(double s, double h) {
   
      speed = s;
      hours = h;
   }   
         
   public void setSpeed(double s) {
      speed = s;
   }
   
   public void setHours(double h) {
      hours = h;
   }   
         
   public double getDistance() {
      return speed * hours;
   }  
}

class DistanceTraveledDemo {

   public static void main(String[] args) {
   
      double hours;
      double speed = 0;
         
      Scanner keyboard = new Scanner(System.in);         
         
      
      System.out.print("How many hours did you travel? ");
      hours = keyboard.nextDouble();
      
      System.out.print("How many MPH are you traveling? ");
      speed = keyboard.nextDouble();
            
      
      DistanceTraveled d = new DistanceTraveled(speed, hours);
      
      System.out.println();
      System.out.println();    
      System.out.println("Hours\t\t\tMiles");
      System.out.println("-------------------------------");
         
                  
      int count = 1;
      while (count <= hours) {
      
         d.setHours(count);
         System.out.println(count + "\t\t\t" + d.getDistance());
         count++;
      } 
   }
}