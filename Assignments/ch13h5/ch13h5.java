//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
/*The Assignment
Modify the GeometricObject class to implement the Comparable interface, and define a static max method in the GeometricObject class for finding the larger of two GeometricObject objects. Draw the UML diagram and implement the new GeometricObject class. Write a Test Program that tusese the max method to find teh larger of two circles and the larger of two rectangles.
*/
import java.*;
public class ch13h5{
   public static void main(String[] args){
      GeometricObject c1 = new circle(1.0, purple, true);
      GeometricObject r1 = new rectangle(2.0, 2.0, shartruse, false);
      GeometricObject c2 = new circle(2.0, brown, false);
      GeometricObject r2 = new rectangle(1.0, 1.0, red, true);



   }// End main
   class circle extends GeometricObject{
      double radius;
      public circle(double newRadius){
         this.radius = newRadius;
      }
      public circle(double newRadius, String newColor, Boolean newFilled){
         this.Radius = newRadius;
         this.color = newColor;
         this.filled = newFilled;
      }
      public GeomtricObject max(GeomtricObject circle1, GeomtricObject circle2){
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


      public abstract double getArea();
   }

   }// End GeomtricObject circle
   class rectangle extends GeomtricObject{
   double sidex;
   double sidey;
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
      public GeomtricObject max(GeomtricObject rect1, GeomtricObject rect2){
         int result = rect1.compareTo(rect2);
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


      public abstract double getArea();
   }//End GeomtricObject rectangle
}// end code
