//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch7h31{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter two arrays to be added together with the first index representing the number of terms in the array.");
     System.out.print("Enter List1: ");
     String list1String = input.nextLine();
     System.out.print("Enter List2: ");
     String list2String = input.nextLine();

     //Convert the given strings into integer arrays
     int[] list1 = strArray(list1String);
     //printArray(list1);
     int[] list2 = strArray(list2String);
    // printArray(list2);

     //Run merge method
     int[] list3 = merge(list1, list2);
     System.out.println();
     System.out.print("The merged List is ");
     printArray(list3);
   }


   public static void printArray(int[] array){

      for(int i=0; i < array.length; i++){
         System.out.print(array[i] + " ");
      }
   }
   public static int[] merge(int[] list1, int[] list2){
      int[] list3 = new int[list1.length+list2.length - 2];
      int i = 1;
      int j = 1;
      int k = 0;
      while( i < list1.length && j < list2.length){
   //      System.out.println("i = " + i + " and j = " + j + " and k = " + k);
   //      System.out.println("list1[i] = " + list1[i] + " and list2[j] = " + list2[j]);
         if (list1[i] < list2[j]){
            //System.out.println("choosing from list 1: " + list1[i]);
            list3[k] = list1[i];
            k++;
            i++;
         //end if
         }
         else{
            list3[k] = list2[j];
            //System.out.println("choosing from list2: " +list2[j]);
            k++;
            j++;
         //end else
         }

      }
      while (i != list1.length){
         list3[k] = list1[i];
         k++;
         i++;
         //end while
      }
      while (j != list2.length){
         list3[k] = list2[j];
         k++;
         j++;
         //end while
      }
   return list3;
   }

   public static int[] strArray(String toArray){
      //Split the Result up into it's parts
      String[] splitResult = toArray.split(" ");
      int[] splitResultint = new int[splitResult.length];
      for(int j=1; j < splitResult.length; j++){
         splitResultint[j] = Integer.parseInt(splitResult[j]);
      }
      return splitResultint;
   }
}
