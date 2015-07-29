//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch6h23{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   String foo = " ";
   char bar = 'a';

   System.out.println("Enter the String you would like to use below:");
   foo = input.nextLine();
   System.out.println("Enter the Character you would like to search for");
   bar = input.nextLine().charAt(0);
   int result = count(foo, bar);
   System.out.println("The Character " + bar + " occurs " + result + " times.");
   //End main
   }
   public static int count(String str, char a){
   //Start Count method
      int result = 0;
      str = str.toLowerCase();
      a = Character.toLowerCase(a);
      for (int i = 0; i < str.length(); i++){
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
