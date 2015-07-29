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
         theString.append(s);
      }// End append
      public MystringBuilder1 append(int i){
         theString.append(i);
      }// End append

      public int length(){
         return theString.length();
      }// end lenght

      public char charAt(int index){
         return theString.charAt(index);
      }// End charAt

      public MystringBuilder1 toLowerCase(){
         theString.toLowerCase();

      }// End toLowerCase

      public MystringBuilder1 substring(int begin, int end){
      theString.substring(begin, end);
      }

      public String toString(){
      theString.toString();
   }
}// end Code
