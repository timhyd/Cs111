//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch11h1{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("This Program Will enable you to work with a custom sized triangle");
     System.out.print("Input Side1: ");
     simpleGeometricObject myTriangle = new simpleGeometricObject();
     myTriangle.side1 = input.nextDouble;
     System.out.print("Input Side2: ");
     myTriangle.side2 = input.nextDouble;
     System.out.print("Input Side3: ");
     myTriangle.side3 = input.nextDouble;
     System.out.print("Information on your given Triangle");
     System.out.print("\n\tThe Date Created: " + myTriangle.getDate() );
     System.out.print("\n\tThe Area: " + myTriangle.getArea() );
     System.out.print("\n\tThe Perimeter: " + myTriangle.getPerimeter() );

  }//End main
}//end Code
