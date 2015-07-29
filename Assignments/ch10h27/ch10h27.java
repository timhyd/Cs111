//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch10h27{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("This Programm shows that my class MystringBuilder1 does function properly");
     System.out.println("Please Enter a string of less than 16 characters.");

     // Input the inputed string
     String theString = input.nextLine();
     System.out.println("Thanks! Now I'm gonna do a ton of stuff to it!");
     MystringBuilder1 theStringObject = new MystringBuilder1();
     theStringObject.MystringBuilder1(theString);

     System.out.println("Now I am going to append to your string");
     System.out.println(theStringObjectAppend1.theString);

     System.out.println("Now I am going to append to your string again" + "This time with the length of your inputed string");
     theStringObject.append( theStringObject.length());
     System.out.println(theStringObjectAppend2.theString);

     System.out.println("Now I am going to show you which character is at a given point in your string");
     System.out.println("Please give a number between 0 and " + (theStringObject.length()-1) );
     int index = input.nextInt();
     System.out.println(theStringObject.charAt(index));

     System.out.println("Now I will show you a substring of your input using your previously given number");
     System.out.println(theStringSub.theString);

  }// end main
} // end Code
