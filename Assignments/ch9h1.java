//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch9h1{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    rect rect1 = new rect();
    rect rect2 = new rect();

    System.out.println("Enter Height of Object 1");
    double height = input.nextDouble();
    System.out.println("Enter Width of Object 1");
    double width = input.nextDouble();
    rect1.rect(height, width);

    System.out.println("Enter Height of Object 2");
    height = input.nextDouble();
    System.out.println("Enter Width of Object 2");
    width = input.nextDouble();
    rect2.rect(height, width);

     System.out.println("Object 1:");
     System.out.println("\t" + "Width: "+ rect1.width);
     System.out.println("\t" + "Height: " + rect1.height);
     System.out.println("\t" + "Area: " + rect1.getArea());
     System.out.println("\t" + "Perimeter: " + rect1.getPerimeter());
     System.out.println("Object 2:");
     System.out.println("\t" + "Width: "+ rect2.width);
     System.out.println("\t" + "Height: " + rect2.height);
     System.out.println("\t" + "Area: " + rect2.getArea());
     System.out.println("\t" + "Perimeter: " + rect2.getPerimeter());




} // End main

public static class rect {
   double height = 1;
   double width = 1;

   void rect(double customheight, double customwidth){
      height = customheight;
      width = customwidth;
   }//end rect object
   double getArea(){
      return height * width;
   }//End get area object
   double getPerimeter(){
      return height * 2 + width * 2;
   }//End periwidth pnkect


}//end rect

} //End Code
