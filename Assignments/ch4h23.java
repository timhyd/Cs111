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
      federalTax = Math.round(federalTax*1000)/10;
      stateTax = Math.round(stateTax*1000)/10;
      fedWith = Math.round(fedWith*1000)/1000;
      stateWith = Math.round(stateWith*1000)/1000;

      //Send inputted name to uppercase
      name = name.toUpperCase();

      //Convert to strings and verify .00 ending
      String netPayString = Double.toString(netPay);
      String grossPayString = Double.toString(grossPay);
      String payString = Double.toString(pay);
      String fedTaxString = Double.toString(federalTax);
      String stateTaxString = Double.toString(stateTax);
      String fedWithString = Double.toString(fedWith);
      String stateWithString = Double.toString(stateWith);
      String totalDedString = Double.toString(totalDed);

      if (netPayString.charAt(netPayString.length()-2) == '.'){
         netPayString = netPayString +"0";
      }
      if (grossPayString.charAt(grossPayString.length()-2) == '.'){
         grossPayString = grossPayString +"0";
      }
      if (payString.charAt(payString.length()-2) == '.'){
         payString = payString +"0";
      }
      if (fedTaxString.charAt(fedTaxString.length()-2) == '.'){
         fedTaxString = fedTaxString +"0";
      }
      if (stateTaxString.charAt(stateTaxString.length()-2) == '.'){
         stateTaxString = stateTaxString +"0";
      }
      if (fedWithString.charAt(fedWithString.length()-2) == '.'){
         fedWithString = fedWithString +"0";
      }
      if (stateWithString.charAt(stateWithString.length()-2) == '.'){
         stateWithString = stateWithString +"0";
      }
      if (totalDedString.charAt(totalDedString.length()-2) == '.'){
         totalDedString = totalDedString +"0";
      }

      System.out.println("");
      System.out.println("Employee Name: "+ name);
      System.out.println("Hourly pay rate: $"+ payString);
      System.out.println("Gross Pay: $"+ grossPayString);
      System.out.println("Deductions:");
      System.out.println("\t"+"Federal Withholding: ("+federalTax+"%): $"+fedWithString);
      System.out.println("\t"+"State Withholding ("+stateTax+"%): $"+ stateWithString);
      System.out.println("\t"+"Total Withholding: $"+totalDedString);
      System.out.println("Net Pay: $"+ netPayString);
   //End code
   }
}
