//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class ch9h1{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int i = 2;
     rect rect1 = new rect();
     rect rect2 = new rect();
    double[][] objects = new double[i][3];
     int k = 0;
     for(int j = 0; j < i; j++){
        k++;
        System.out.println("Enter Height of Object " + k );
        objects[j][0] = input.nextDouble();
        System.out.println("Enter Width of Object " + k);
        objects[j][1] = input.nextDouble();
     }
     rect rect1 = new rect(objects[0][0], objects[0][1]);
     rect rect2 = new rect(objects[1][0], objects[1][1]);



     k = 0;
     for(int l = 0; l < i; l++){
        k++;
        System.out.println("Object " + k +":");
        System.out.println("\t" + " Width: "+ objects[l][1] );
        System.out.println("\t" + " Height: " + objects[l][0] );
        System.out.println("\t" + "Area: " + objects[l][2] );
        System.out.println("\t" + "Perimeter: " + objects[l][3] );
     }


} // End main

public class rect {
   double height = 1;
   double width = 1;

   public void rect(double customheight, double customwidth){
      height = customheight;
      width = customwidth;
   }//end rect object
   double getArea(double areaheight, double areawidth){
      return areaheight * areawidth;
   }//End get area object
   double getPerimeter(double periheight, double periwidth){
      return periheight * 2 + periwidth * 2;
   }//End periwidth pnkect
   double getHeight(){
      return height;
   }
   double getWidth(){
      return width;
   }

}//end rect

} //End Code
