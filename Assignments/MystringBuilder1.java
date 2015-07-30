//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class MystringBuilder1{
   String theString;
      public void MystringBuilder1(String s){
         theString = s;
      } // End MyStringBuilder1
      public void MystringBuilder1(){
         theString = " ";
      }


      public MystringBuilder1 append(MystringBuilder1 s){
         MystringBuilder1 theStringObjectAppend1 = new MystringBuilder1();
         theStringObjectAppend1.theString = this.theString + s.theString;
            // I tryed to use Append. It didn't work well
            // It is still here to prove effort was given.
            // theStringObjectAppend1.theString = theStringObjectAppend1.theString.append(s.theString);
         return theStringObjectAppend1;
      }// End append
      public MystringBuilder1 append(int i){
         MystringBuilder1 theStringObjectAppend2 = new MystringBuilder1();
         theStringObjectAppend2 = this.theStringObject + i;
         return theStringObjectAppend2;

      }// End append

      public int length(){
         return theString.length();
      }// end lenght

      public char charAt(int index){
         return theString.charAt(index);
      }// End charAt

      public MystringBuilder1 toLowerCase(){
         MystringBuilder1 theStringLower = new MystringBuilder1();
         theStringLower = theStringLower.toLowerCase();
         return theStringLower;
      }// End toLowerCase

      public MystringBuilder1 substring(int begin, int end){
      MystringBuilder1 theStringSub = new MystringBuilder1();
      theStringSub = theStringSub.substring(begin, end);
      return theStringSub;
   }// end subString

      public String toString(){
      return theString;

   }
}// end Code
