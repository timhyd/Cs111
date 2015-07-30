//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
import java.util.*;
public class myTriangleBuilder{
   Double side1;
   Double side2;
   Double side3;

      public myTriangleBuilder myTriangleBuilder(){
         this.side1 = 1;
         this.side2 = 1;
         this.side3 = 1;
         return this;
      }// End default myTriangleBuilder

      public myTriangleBuilder myTriangleBuilder(Double newSide1,Double newSide2, Double newSide3){
         this.side1 = newSide1;
         this.side2 = newSide2;
         this.side3 = newSide3;
         return this;
      }//End myTriangleBuilder Method

      public Double getPerimeter(){
         Double perimeter;
         perimeter = this.side1 + this.side2 + this.side3;
         return perimeter;
      }// end getPerimeter

      public Double getArea(){
         Double area;
         Double p;
         p = ((this.side1 + this.side2 + this.side3) / 2);
         area = math.pow((p(p-this.side1)) , )
      }// end getArea

      public String toString(){
         String side1String = Double.toString(this.side1);
         String side2String = Double.toString(this.side2);
         String side3String = Double.toString(this.side3);
         String result = "Triange: side1 = " + side1String + " side2 = " + side2String +" side3 = "  + side3String;
         return result;

      }// End toString
}//End myTriangleBuilder
