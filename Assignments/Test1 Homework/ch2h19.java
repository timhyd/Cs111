//Programmed by Timothy D. Hydanus, Head Programmmer-Goalpost Programming

import java.util.*;
public class ch2h19{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      //Prompt for the correct input on one line
      System.out.println("Solve for the are of a Triangle "+"Given: (x1, y1) (x2, y2) (x3, y3)");
      System.out.println("Enter the point Coordinates on one"+" line below in the form: x1 y1 x2 y2 x3 y3");
      //string input
      String points = input.nextLine();


      //Find the Points within that string.
      String[] splitResult;
      String delimiter = " ";
      splitResult = points.split(delimiter);
      while(splitResult.length != 6){
         splitResult = null;
         System.out.println("Error: Incorrect Number of Coordinates");
         System.out.println("Enter the point Coordinates on one"+" line below in the form: x1 y1 x2 y2 x3 y3");
         points = input.nextLine();
         splitResult = points.split(delimiter);
      }
      System.out.println("Thank you for you Input");
      System.out.print("Processing");
      Double x1 = Double.parseDouble(splitResult[0]);
      Double y1 = Double.parseDouble(splitResult[1]);
      Double x2 = Double.parseDouble(splitResult[2]);
      Double y2 = Double.parseDouble(splitResult[3]);
      Double x3 = Double.parseDouble(splitResult[4]);
      Double y3 = Double.parseDouble(splitResult[5]);

      //Calculating the constant s
      double baseSideOne = ( Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));

      System.out.print(" .");

      double baseSideTwo = ( Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2));

      System.out.print(" .");

      double baseSideThree = ( Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));

      System.out.print(" .");

      //Calculate the three sides

      double sideOne = Math.pow(baseSideOne, (0.5));

      System.out.print(" .");

      double sideTwo = Math.pow(baseSideTwo, (0.5));

      System.out.print(" .");

      double sideThree = Math.pow(baseSideThree, (0.5));

      System.out.print(" .");

      double sCons = ((sideOne + sideTwo + sideThree) / 2 );

      System.out.print(" .");

      //calculate the base for the area
      double areaBase = (sCons*(sCons - sideOne)*(sCons - sideTwo)*(sCons - sideThree));

      System.out.print(" .");

      //Calculate the area
      double area = Math.pow(areaBase, (0.5));

      System.out.println(" .");

      System.out.print("The Area of the given Triangle is: " + area);
   }
}
