//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch6h23{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String foo = " ";
   Char bar = "a";

   Sysem.out.println("Enter the String you would like to use below:");
   foo = input.nextLine;
   bar = input.next().charAt(0);
   int result = count(foo, bar);




   System.out.println("The Character " + a + " occurs " + result + " times.");
   //End main
   }
   public static int count(String str, char a){
   //Start Count method
      int result = 0;
      for (int i = 0; i = str.length()){
         if (str.charAt(i) == a){
            result++;
            //end if
         }
      //end for
      }
      return result;
   //End count method
   }
}
