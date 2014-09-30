import java.util.Scanner;
import java.text.DecimalFormat;

public class HotelOccupancy {

   public static void main(String[] args) {
   
      int floors;
      int rooms;
      int occupiedRooms;
      int vacantRooms;
      int totalRooms = 0;
      int totalVacantRooms = 0;
      int totalOccupiedRooms = 0;
      double occupancyRate;
      
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many floors does your hotel have? ");
      floors = keyboard.nextInt();
      
      if(floors < 1) {
         System.out.print("Your entry is invalid");
         System.exit(0); 
      } else
         for(int count = 1; count <= floors; count++) {
            System.out.print("Each floor must have at least 10 rooms. "
                             + "\nHow many rooms are on floor " 
                             + count + "? ");
                 
            rooms = keyboard.nextInt();
                    
            if(rooms >= 10) {   
               System.out.print("How many rooms are occupied on floor " 
                                     + count + "? ");                                   
            } 
            else { 
               System.out.println("Your entry is invalid");
                    
               System.exit(0);    
            }
         {  
               occupiedRooms = keyboard.nextInt();
               vacantRooms = rooms - occupiedRooms;
               totalRooms = totalRooms + rooms;
               totalOccupiedRooms = totalOccupiedRooms + occupiedRooms;
               totalVacantRooms = totalVacantRooms + vacantRooms;
            }
         }
               
                                  
      DecimalFormat formatter = new DecimalFormat("#0.00");          
      System.out.println("\n\nThe hotel has " + totalRooms 
                                 + " total rooms.");
      System.out.println(totalOccupiedRooms + " rooms are occupied.");
      System.out.println(totalVacantRooms + " rooms are vacant");
               
      occupancyRate = ((double)totalOccupiedRooms / (double)totalRooms) * 100;
      System.out.println("The occupancy rate for the hotel is %"
                                 + formatter.format(occupancyRate));
               
   }
       
}