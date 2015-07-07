//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch5h1{
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
      if (startString(startString.length-1) != "0"){
         while(startString(startString.length-1) != "0"){
            System.out.println("");
            System.out.print("Error: Incorrect Input.");
            System.out.print("Enter all terms separated by spaces and ending with a zero");
            String startString = input.nextLine();
         //End While
         }
      //End if
      }

      for(int j=0; j<(splitResult.length); j++){
         splitResult[j] = Integer.parseInt(splitResult[j]);
      //End for loop
      }

      //Split the Result up into it's parts
      splitResult = startString.split(delimiter);
      for(int i=0; i<splitResult.length; i++){
         if (splitResult[i]>0){
            posNums++;
         //End if
         }
         if(splitResult[i]<0){
            negNums++;
         }
      //End for loop
      }

      System.out.println("There are "+posNums+" Positive Numbers.");
      System.out.println("There are "+negNums+" Negative Numbers.");

      //End Code
      }
}
