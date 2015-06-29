//Original Programming - Timothy Hydanus, Head Programmer GoalPost Programming
//Modified assignment: Desplay employee name in UPPER CASE. And display currency amounts to two decimal places.

import java.util.*;
public class ch3h29{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Prep format to add zeros to two zeros and cut off to two decimals
      DecimalFormat df = new DecimalFormat( "#.00" );

      //Prompt for input
      System.out.print("Enter employee's name: ");
      String name = input.nextline();
      System.out.print("Enter number of hours worked in a week: ");
      double hours = input.nextDouble();
      hours = df.format(hours);
      System.out.print("Enter hourly pay rate: ")
      double pay = input.nextDouble();
      pay = df.format(pay);
      System.out.print("Enter federal tax withholding rate: ");
      double federalTax = input.nextDouble();
      System.out.print("Enter State tax witholding rate: ");
      double stateTax = input.nextDouble();

      //Calculate info
      double grossPay = pay * hours;
      double fedWith = grossPay * federalTax;
      double stateWith = grosspay * stateTax;
      double totalDed = fedWith + stateWith;
      double netPay = grossPay - fedWith - stateWith;

      //Send inputted name to uppercase
      name = name.toUpperCase();

      //Convert inputs to usable strings
      hours = hours.toString();
      pay = pay.toString();
      federalTax = federalTaxString.toString();
      stateTax = stateTax.toString();

      System.out.println("");
      System.out.print("Employee Name: "+ name);
      System.out.print("Hourly pay rate: "+ payString);
      System.out.print("Gross Pay: "+ );


   //End code
   }
}
