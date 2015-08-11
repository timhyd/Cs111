//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch12h5{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("This Program Will enable you to work with a custom sized triangle");
     System.out.print("Input Side1: ");
     simpleGeometricObject myTriangle = new simpleGeometricObject();
     Double side1 = input.nextDouble();
     System.out.print("Input Side2: ");
     Double side2 = input.nextDouble();
     System.out.print("Input Side3: ");
     Double side3 = input.nextDouble();
     System.out.print("Input desired Color: ");
     String color = input.next();
     System.out.print("Input filled or not (true/false): ");
     Boolean filled = input.nextBoolean();
     try{
       myTriangle.Triangle(side1, side2, side3);
     }
     catch (IllegalTriangleException){
        System.out.println("Exception: "+ex);
        System.out.println("Setting Triangle to Defaults");
        myTriangle.myTriangleBuilder();
     }
     System.out.print("Information on your given Triangle");
     System.out.print("\n\tThe Date Created: " + myTriangle.getDate() );
     System.out.print("\n\tThe Area: " + myTriangle.getArea() );
     System.out.print("\n\tThe Perimeter: " + myTriangle.getPerimeter() );
     System.out.print("\n\tThe Color: " + myTriangle.color + " Filled ?= " + myTriangle.filled);


  }//End main
}//end Code
