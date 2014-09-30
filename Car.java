import java.util.Scanner;
    
public class Car {

   private int yearModel;
   private String make;
   private int speed;
      
   public Car(int year, String mke, int spd) {
      yearModel = year;
      make = mke;
      speed = 0;
   }
               
   public void setYearModel(int year) {
      yearModel = year;
   }
  
   public void setMake(String mke) {
      make = mke;
   }
  
   public void accelerate() {
      speed += 5;
   }
      
   public void brake () {
      speed -= 5;
   }
      
   public int getYearModel() {
      return yearModel;
   }
  
   public String getMake() {
      return make;
   }
   
   public int getSpeed() {
      return speed;
   }
 
}

class CarDemo {
   public static void main (String[] args) {
    
      int carYear;   
      String carModel;
      int carSpeed = 0;
      
      Scanner keyboard = new Scanner(System.in);
     
      System.out.println("What kind of car do you drive? ");
      carModel = keyboard.nextLine();
      
      System.out.println("What year is your car? ");
      carYear = keyboard.nextInt();
      
      
      Car details = new Car(carYear, carModel, carSpeed);
      
      System.out.println("Here is your car information:");
      System.out.println("You drive a " + details.getYearModel() + " " + details.getMake() + ".\n");
      
      details.accelerate();
      System.out.println("Your car is now going " + details.getSpeed() + " MPH.");
      
      details.accelerate();
      System.out.println("Your car just sped up to " + details.getSpeed() + " MPH.");
      
      details.accelerate();
      System.out.println("Your car is going even faster at " + details.getSpeed() + " MPH.");
      
      details.accelerate();
      System.out.println("Look at that! Your car is now at " + details.getSpeed() + " MPH.");
      
      details.accelerate();
      System.out.println("INSANE!!! You're going a crazy " + details.getSpeed() + " MPH.\n");
      
      details.brake();
      System.out.println("Wait, your car is now going " + details.getSpeed() + " MPH.");
                                  
      details.brake();
      System.out.println("Don't know what's happening, but now you're at " + details.getSpeed() + " MPH.");
      
      details.brake();
      System.out.println("I think your engine is dying. You're now going " + details.getSpeed() + " MPH.");
      
      details.brake();
      System.out.println("Are you going uphill? Your speed is " + details.getSpeed() + " MPH.");
      
      details.brake();
      System.out.println("Well. Your car just died. You're stalled at " + details.getSpeed() + " MPH.");
   }
}
    
