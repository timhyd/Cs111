import java.util.*;
public class ch8h7{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
   System.out.print("enter the number of points: ");
   int numberOfPoints = input.nextInt();

   // Create an array to stor points

   double[][] points = new double[numberOfPoints][2];
   System.out.print("Enter " + numberOfPoints + " points: ");
   int k = 0;
   for (int i = 0; i < points.length; i++) {
      k++;
      System.out.println("Enter Point "+ k +": ");
      points[i][0] = input.nextDouble();
      points[i][1] = input.nextDouble();
      //System.out.println("I'm Thinking...");
   }

   //p1 and p2 are teh indices in the points array
   int p1 = 0;
   int p2 = 1; //Initial two points
   double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); // Initialize shortestDistance

   // Compute distance for every two points
   for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
         //System.out.println("I'm thinking...");
         double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance


         if (shortestDistance > distance) {
            p1 = i; // Update p1
            p2 = j; // Updates p2
            shortestDistance = distance; // Update shortestDistance
         }
      }
   }


   //Display Result
   System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")" );





  //end main
  }
  // compute the distance between two points (x1, y1)  and (x2, y2)
  public static double distance(
     double x1, double y1, double x2, double y2) {
     //System.out.println("distance method invoked.");
     return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
     }
//End code
}
