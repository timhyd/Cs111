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


      public String append(MystringBuilder1 s){
         theString.append(s);
      }// End append
      public void append(int i){
         theString.append(i);
      }// End append

      public int length(){
         return theString.length();
      }// end lenght

      public char charAt(int index){
         return theString.charAt(index);
      }// End charAt

      public void toLowerCase(){
         theString.toLowerCase();

      }// End toLowerCase

      public void substring(int begin, int end){
      theString.substring(begin, end);
      }

      public void toString(){
      theString.toString();
   }
}// end Code
