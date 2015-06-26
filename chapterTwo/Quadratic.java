import java.util.Scanner;
public class Quadratic{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Input an equation");
      System.out.println("In the Form Y=a x^2 + bx + C");
      System.out.println("Enter 'a' coefficient: ");
      double a = input.nextDouble();
      System.out.println("Enter 'b' coefficient: ");
      double b = input.nextDouble();
      System.out.println("Enter 'C' Constant: ");
      double c = input.nextDouble();
      System.out.println("");
      System.out.println("Thank You for your input.");
      System.out.print("Computing");
      double radical = ( (Math.pow( b, 2 )) - (4 * ( a * c ) ) );
      System.out.print(" .");
      double denom = 2*a;
      System.out.print(" .");
      double result1 = ((-b) + (Math.pow(radical, .5) / denom));
      System.out.print(" .");
      double result2 = ((-b) - (Math.pow(radical, .5) / denom));
      System.out.print(" .");
      System.out.println("");
      System.out.print("The Value(s) of X at zero is(are): " + result1 + " & " + result2);
      System.out.println(" ");
      System.out.print("You're Welcome");
   }
}
