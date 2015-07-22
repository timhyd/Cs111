//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch7h31{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   printline("Enter two arrays to be added together"+" with the first index representing the number of terms in the array.");
   printdis("Enter List1: ");
   String list1String = input.nextLine();
   printdis("Enter List2: ");
   String list2String = input.nextLine();

   //Convert the given strings into integer arrays
   int[] list1 = strArray(list1String);
   int[] list2 = strArray(list2String);


   //Run merge method
   int[] list3 = merge(list1, list2);
   printArray(list3);
   //End Main
   }
   public static void printArray(int[] array){
      String result = "";
      for(int i=0; i < array.length; i++){
         result += array[i] + " ";
         //end for
      }
      printdis("The merged list is "+result);
      //end printArray method
   }
   public static int[] merge(int[] list1, int[] list2){
      int[] list3 = new int[list1.length+list2.length];
      int i = 1;
      int j = 1;
      int k = 0;
      while( i < list1.length || j < list2.length){
         if (list1[i] < list2[j]){
            list3[k] = list1[i];
            k++;
            i++;
            System.out.println(list1[i]);
         }
         else{
            list3[k] = list2[j];
            k++;
            j++;
            System.out.println(list2[j]);
         }
         //end while
      }
   return list3;
   //End method merge

   }
   public static void printdis(String toPrint){
      System.out.print(toPrint);
      //End printdis method
   }
   public static void printline(String toPrint){
      System.out.println(toPrint);
      //End printline method
   }
   public static int[] strArray(String toArray){
      //Split the Result up into it's parts
      String[] splitResult = toArray.split(" ");
      int[] splitResultint = new int[splitResult.length];
      for(int j=1; j < splitResult.length; j++){
         splitResultint[j] = Integer.parseInt(splitResult[j]);
      //End for loop
      }
      return splitResultint;
   //End strArray method
   }


//End Code
}
