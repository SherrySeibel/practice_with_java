import java.util.Scanner;
import java.io.*;

public class FileDisplay {

   String fileName;
  
   public FileDisplay(String fn) {
      fileName = fn;
   }
   
   public void displayHead() throws IOException {
      String input;
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
         
      int count = 1;
         
      while(count <= 5) {                  
         input = inputFile.nextLine();
         System.out.println(input);
         count++;
      }
              
      inputFile.close();     
   }
   
   public void displayContents() throws IOException {
   
      String input; 
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
         
      while (inputFile.hasNext()) {
      
         int count = 1;
         input = inputFile.nextLine();
         System.out.println(input);
         count++;
      }
      inputFile.close();     
   }
   
   public void displayWithLineNumbers() throws IOException {
   
      String input;
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
         
      int i = 1;
      int count = 0;
      while(inputFile.hasNext()) {
      
         input = inputFile.nextLine();
               
         System.out.println(i + ": " + input);
         count++;
         i++;
      }
      inputFile.close();    
   }     
}

class FileDisplayDemo {

   public static void main (String[] args) throws IOException {
     
      String newFile;
      String contents;
      int contentLine;
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("How many lines do you want your " 
                      + "file's content to be? ");
      contentLine = keyboard.nextInt();
      keyboard.nextLine();
      
      
      System.out.print("What is the file name? ");
      newFile = keyboard.nextLine();
      
      PrintWriter outputFile = new PrintWriter(newFile);
      
      for (int i = 1; i <= contentLine; i++) {
         System.out.print("Enter contents for " 
                         + "line" + " " + i + ": ");
         contents = keyboard.nextLine();
         outputFile.println(contents);
      }
      
      outputFile.close();
      System.out.println("Data written to file\n"); 
       
      String fileName;
            
      System.out.print("What is you file's name? ");
      fileName = keyboard.nextLine();
      
      FileDisplay fd = new FileDisplay(fileName);
      
      fd.displayHead();
      System.out.println();
      
      fd.displayContents();
      System.out.println();
      
      fd.displayWithLineNumbers();
      System.out.println();
      
      System.out.println(fileName);
   }
}