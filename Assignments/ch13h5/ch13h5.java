//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
/*The Assignment
Modify the simpleGeometricObject class to implement the Comparable interface, and define a static max method in the simpleGeometricObject class for finding the larger of two simpleGeometricObject objects. Draw the UML diagram and implement the new simpleGeometricObject class. Write a Test Program that tusese the max method to find teh larger of two circles and the larger of two rectangles.
*/
import java.*;
public class ch13h5{
   public static void main(String[] args){
      simpleGeometricObject c1 = new circle(1.0, purple, true);
      simpleGeometricObject r1 = new rectangle(2.0, 2.0, shartruse, false);
      simpleGeometricObject c2 = new circle(2.0, brown, false);
      simpleGeometricObject r2 = new rectangle(1.0, 1.0, red, true);



   }// End main
   class circle extends simpleGeometricObject{
      double radius;
      double area = ((Math.PI)*(Math.pow(this.radius, 2)));
      public circle(double newRadius){
         this.radius = newRadius;
      }
      public circle(double newRadius, String newColor, Boolean newFilled){
         this.radius = newRadius;
         this.color = newColor;
         this.filled = newFilled;
      }
      public simpleGeometricObject max(simpleGeometricObject circle1, simpleGeometricObject circle2){
         int result = (circle1.getArea).compareTo(circle2.getArea);

         switch(result){
            case 1:
               return circle1;
               break;
            case -1:
               return circle2;
               break;
            case 0:
               return circle1;
         }
//
//         public static double getArea(){
//               return ((math.pi)*(math.pow(this.radius, 2)));
//            }

      }
      public double getArea(){
            return this.area;
         }



   }// End GeomtricObject circle


   class rectangle extends simpleGeometricObject{
   double sidex;
   double sidey;
   double area = sidex * sidey;
      public rectangle(double newsidex, double newsidey){
         this.sidex = newsidex;
         this.sidey = newsidey;
      }
      public rectangle(double newsidex, double newsidey, double newColor, Boolean newfilled){
         this.sidex = newsidex;
         this.sidey = newsidey;
         this.color = newColor;
         this.filled = newfilled;
      }
      public simpleGeometricObject max(simpleGeometricObject rect1, simpleGeometricObject rect2){
         int result = (rect1.getArea).compareTo(rect2.getArea);
         switch(result){
            case 1:
               return rect1;
               break;
            case -1:
               return rect2;
               break;
            case 0:
               return rect1;
               break;
         }
      }//End max function


      public double getArea(){
         return this.area;
      }
   }//End GeomtricObject rectangle
}// end code
