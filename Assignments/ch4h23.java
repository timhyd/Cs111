//Original Programming - Timothy Hydanus, Head Programmer GoalPost Programming
//Modified assignment: Desplay employee name in UPPER CASE. And display currency amounts to two decimal places.
import java.util.*;
import java.text.*;
public class ch4h23{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      //Prompt for input
      System.out.print("Enter employee's name: ");
      String name = input.nextLine();
      System.out.print("Enter number of hours worked in a week: ");
      double hours = input.nextDouble();
      System.out.print("Enter hourly pay rate: ");
      double pay = input.nextDouble();
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

      netPay = Math.round(netPay*1000)/1000;
      grossPay = Math.round(grossPay*1000)/1000;
      pay = Math.round(pay*1000)/1000;

      //Send inputted name to uppercase
      name = name.toUpperCase();
      federalTax = Math.round(federalTax*1000)/10;
      stateTax = Math.round(stateTax*1000)/10;

      System.out.println("");
      System.out.println("Employee Name: "+ name);
      System.out.println("Hourly pay rate: $"+ pay);
      System.out.println("Gross Pay: $"+ grossPay);
      System.out.println("Deductions:");
      System.out.println("\t"+"Federal Withholding: ("+federalTax+"%): $"+fedWith);
      System.out.println("\t"+"State Withholding ("+stateTax+"%): $"+ stateWith);
      System.out.println("\t"+"Total Withholding: $"+totalDed);
      System.out.println("Net Pay: $"+ netPay);
   //End code
   }
}
