//Original Code by Timothy Hydanus, Lead Programmmer - Goalpost Programming
/*The Assignment
Modify the simpleGeometricObject class to implement the Comparable interface, and define a static max method in the simpleGeometricObject class for finding the larger of two simpleGeometricObject objects. Draw the UML diagram and implement the new simpleGeometricObject class. Write a Test Program that tusese the max method to find teh larger of two circles and the larger of two rectangles.
*/
import java.*;
public class ch13h5{
   public void main(String[] args){
      circle circle1 = new circle(1.0, "purple", true);
      rectangle rect1 = new rectangle(2.0, 2.0, "shartruse", false);
      circle circle2 = new circle(2.0, "brown", false);
      rectangle rect2 = new rectangle(1.0, 1.0, "red", true);
      circle circleResult = new circle(1.0, "null", false);
      rectangle rectResult = new rectangle(1.0, 1.0, "null", false);
      System.out.println();
      System.out.println("For the inputs:");
      System.out.println("The Circles:");
      System.out.println("Circle1:");
      printCircle(circle1);
      System.out.println("Circle2: ");
      printCircle(circle2);
      System.out.println("The Rectangle");
      System.out.println("Rectangle1: ");
      printRect(rect1);
      System.out.println("Rectangle2: ");
      printRect(rect2);
      System.out.println();

      circleResult = maxCircle(circle1, circle2);

      rectResult = maxRect(rect1, rect2);

      System.out.println("The Circles: ");
      if(circleResult.area == circle1.area){
         System.out.println("Circle1 Is Larger");
      }
      else{
         System.out.println("Circle2 Is Larger");
      }
      System.out.println("The Rectangles:");
      if(rectResult.area == rect1.area){
         System.out.println("Rectangle1 Is Larger");
      }
      else{
         System.out.println("Reectange2 Is larger");
      }



   }// End main

   public void printRect(rectangle rect){
      System.out.println("\tHeight: "+rect.sidey);
      System.out.println("\tWidth: "+rect.sidex);
      System.out.println("\tColor: "+rect.color);
      System.out.println("\tFilled: "+rect.filled);
      System.out.println();
   }//End print rect


   public void printCircle(circle theCircle){
      System.out.println("\tRadius: "+theCircle.radius);
      System.out.println("\tColor: "+theCircle.color);
      System.out.println("\tFilled: "+theCircle.filled);
      System.out.println();
   }//End PrintCirlcle
   public class circle maxCircle (circle circle1, circle circle2){
      int result = circle1.compareTo(circle2);

      switch(result){
         case 1:
            return circle1;
            break;
         case -1:
            return circle2;
            break;
         case 0:
            return circle1;
      }//End switch


   }


   public class rectangle maxRect(rectangle rect1, rectangle rect2){
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
}
}// ch13h5 class


   class rectangle extends simpleGeometricObject impliments comparable {
   double sidex;
   double sidey;
   double area;
      public rectangle(double newsidex, double newsidey){
         this.sidex = newsidex;
         this.sidey = newsidey;
         this.area = sidex * sidey;
      }
      public rectangle(double newsidex, double newsidey, String newColor, Boolean newfilled){
         this.sidex = newsidex;
         this.sidey = newsidey;
         this.color = newColor;
         this.filled = newfilled;
         this.area = sidex * sidey;
      }

      //@Override
      public int compareTo(Rectangle secRect){
         if(this.area == secRect.area){
            return 0;
         }// End if
         else{
         if (this.area > secRect.area){
            return 1;
         }//End if
         else{
            return -1;
         }//End else
      }//End else
      }//End compareTo

   }//End GeomtricObject rectangle
   class circle extends simpleGeometricObject impliments comparable{
      double radius;
      double area;
      public circle(double newRadius){
         this.radius = newRadius;
         this.area = ((Math.PI)*(Math.pow(this.radius, 2)));
      }//End circle constructer
      public circle(double newRadius, String newColor, Boolean newFilled){
         this.radius = newRadius;
         this.color = newColor;
         this.filled = newFilled;
         this.area = ((Math.PI)*(Math.pow(this.radius, 2)));
      }//Ends another circle constructor


      }//End Max Method
      //@Override
      public int compareTo(circle secCircle){
         if(this.area == secCircle.area){
            return 0;
         }// End if
         else{
         if (this.area > secCircle.area){
            return 1;
         }//End if
         else{
            return -1;
         }//End else
      }//End else
      }//End compareTo
   }// End GeomtricObject circle
