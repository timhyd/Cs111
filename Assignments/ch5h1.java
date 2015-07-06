//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch1h3{
   public static void main(String[] args){
      int posNums = 0;
      int negNums = 0;
      //Set up the scanner and string splitter
      Scanner input = new Scanner(System.in);
      String delimiter = " ";
      String[] splitResult;
      //Prompt for string
      System.out.print("Enter all terms separated by spaces and ending with a zero");
      String startString = input.nextLine();
      if startString(startString.length-1) != "0"{
         while(startString(startString.length-1) != "0"){
            System.out.prinln("");
            System.out.print("Error: Incorrect Input.");
            System.out.print("Enter all terms separated by spaces and ending with a zero");
            String startString = input.nextLine();
         //End While
         }
      //End if
      }
      //Split the Result up into it's parts
      splitResult = startString.split(delimiter);
      for(int i=0; i<splitResult.length; i++){
         if (splitResult(i)>0){
            posNums++;
         //End if
         }
         if(splitResult(i)<0){
            negNums++;
         }
      //End for loop
      }

      //End Code
      }
}
