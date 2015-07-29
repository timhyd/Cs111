//Program will take user inputs of x,y and radii to determine if two circles overlap, don't overlap, or are inside one another.
//Original Programming - Timothy Hydanus, Head Programmer GoalPost Programming
import java.util.*;
public class ch3h29{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Don't know if your circles are inside each other?"+" or simply overlapping? Step right up and Find out!.");
      System.out.println("");
      System.out.println("In the form: x y radus");
      System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
      String circle1String = input.nextLine();
      System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
      String circle2String = input.nextLine();
      System.out.println("");
      System.out.println("Thank You for your Input!");
      System.out.println("");


      //break down given inputs
      String delimiter = " ";
      String[] splitResult1;
      String[] splitResult2;

      splitResult2 = circle2String.split(delimiter);
      splitResult1 = circle1String.split(delimiter);

      //Verify the split results
      while(splitResult1.length != 3){
         if (splitResult1.length != 3){
            System.out.println("Error: Incorrect # of terms");
            System.out.println("Please re-Input circle1's x-, y- corrinates and radus separated by spaces.");
            circle1String = input.nextLine();
         //End if
         }
         splitResult1 = circle1String.split(delimiter);
      //end while
      System.out.println("");
      }

       while(splitResult2.length != 3){
         if (splitResult2.length != 3){
            System.out.println("Error: Incorrect # of terms");
            System.out.println("Please re-Input circle's x-, y- corrinates and radus separated by spaces.");
            circle1String = input.nextLine();
         //End if
         }
         splitResult2 = circle2String.split(delimiter);
      //End while
      }
      //Extract circle components
      String sx1 = splitResult1[0];
      String sy1 = splitResult1[1];
      String sr1 = splitResult1[2];
      String sx2 = splitResult2[0];
      String sy2 = splitResult2[1];
      String sr2 = splitResult2[2];
      Double centerDist = 0.0;

      //Convert into double form
      Double x1 = Double.parseDouble(sx1);
      Double x2 = Double.parseDouble(sx2);
      Double y1 = Double.parseDouble(sy1);
      Double y2 = Double.parseDouble(sy2);
      Double r1 = Double.parseDouble(sr1);
      Double r2 = Double.parseDouble(sr2);

      //Process the inputs
      //iniate the result variable.
         //if  0 - no overlap or enclosed
         //if  1 - overlap not enclosed
         //if  2 - one circle enclosed no overlap
      int result = 0;

      //find the distance between centers with distance formula
      double centerDistDenom = (Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
      centerDist = Math.pow(centerDistDenom, 0.5);

      if (centerDist <= (r1 + r2)){
         result = 1;
      }

      if(centerDist <= Math.abs(r1-r2)){
      result = 2;
      }
      if (result == 2){
         if (r1 < r2){
         System.out.println("Circle1 is Enclosed by Circle2");
         }
         else{
            System.out.println("Circle2 is Enclosed by Circle1");
         }
      }
      if (result == 0){
         System.out.println("Circle1 and Circle2 do not overlap");
      }
      if (result == 1){
         System.out.println("The Circles Overlap");
      }
   //End of code
   }
}
