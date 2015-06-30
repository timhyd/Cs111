//Original Programming - Timothy Hydanus, Head Programmer GoalPost Programming
//Modified assignment: Desplay employee name in UPPER CASE. And display currency amounts to two decimal places.
import java.util.*;
import java.text.*;
public class ch4h23{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Prep format to add zeros to two zeros and cut off to two decimals
      DecimalFormat df = new DecimalFormat( "#.00" );

      //Prompt for input
      System.out.print("Enter employee's name: ");
      String name = input.nextLine();
      System.out.print("Enter number of hours worked in a week: ");
      double hours = input.nextDouble();
      hours = df.format(hours);
      System.out.print("Enter hourly pay rate: ");
      double pay = input.nextDouble();
      payString = Double.toString()
      System.out.print("Enter federal tax withholding rate: ");
      double federalTax = input.nextDouble();
      System.out.print("Enter State tax witholding rate: ");
      double stateTax = input.nextDouble();

      //Calculate info
      double grossPay = pay * hours;
      double fedWith = grossPay * federalTax;
      double stateWith = grossPay * stateTax;
      double totalDed = fedWith + stateWith;
      double netPay = grossPay - fedWith - stateWith;

      //Format the dollar places
      netpay = df.format(netPay);
      grossPay = df.format(grossPay);
      grossPay = grossPay.toString();

      //Send inputted name to uppercase
      name = name.toUpperCase();

      //Convert inputs to usable strings
      hours = Double.toString(hours);
      pay = Double.toString(pay);
      pay = df.format(pay);
      federalTaxString = Double.toString(federaltax);
      stateTax = Double.toString(stateTax);

      System.out.println("");
      System.out.print("Employee Name: "+ name);
      System.out.print("Hourly pay rate: $"+ payString);
      System.out.print("Gross Pay: $"+ grossPay);
      System.out.println("Deductions:");
      System.out.println("\t"+"Federal Withholding: ("+federalTaxString+"%): $"+fedWith);
      System.out.println("'\t'State Withholding ("+stateTax+"%): $"+ stateWith);
      System.out.println("'\t'Total Withholding: $"+totalDed);
      System.out.println("Net Pay: $"+ netPay);
   //End code
   }
}
