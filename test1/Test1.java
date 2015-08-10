import java.util.Scanner;

// This is some ugly code. A lot of stuff is kept in so I can reference previous work
// I'm Sorry
// Tim

public class Test1 {
  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows (1-10): ");
    int rows = input.nextInt();


    //Test Edit: Timothy Hydanus Part a & b.
    while(rows<1 || rows>10){
      System.out.println("ERROR: number not in the specified range (1-10)!");
      System.out.print("Enter the number of rows (1-10): ");
      rows = input.nextInt();
   }
    System.out.print("Enter the number of columns (1-10): ");
    int cols = input.nextInt();
    //Test Edit: Timothy Hydanus Part a & b.
    while(cols<1 || cols>10){
      System.out.println("ERROR: number not in the specified range (1-10)!");
      System.out.print("Enter the number of columns (1-10): ");
      cols = input.nextInt();
   }

   // Test1 take-home edit Timothy Hydanus part c.
   //Prompt user of the different values of the matrix
   int[][] foobar = new int[rows][cols];
   for(int i = 1; i < rows + 1; i++){
      for(int j = 1; j < cols + 1; j++){
      System.out.print("Please Enter Row: "+ i +" Column: " + j + ": ");
      foobar[i-1][j-1] = input.nextInt();
   }
}
   // Create originalMatrix as rectangular two dimensional array
   int[][] originalMatrix = new int[rows][cols];
   originalMatrix = foobar;

   //Split the given rows
//   originalMatrix = splitString(foobar, rows, cols);


//Test Edit - Timothy Hydanus Matrix no longer random
/*
    // Assign random values to originalMatrix
    for (int row = 0; row < originalMatrix.length; row++)
      for (int col = 0; col < originalMatrix[row].length; col++) {
        originalMatrix[row][col] = (int) (Math.random() * 1000);
      }
*/
    // Print original matrix
    System.out.println("\nOriginal matrix:");
    String[][] spaceMatrix;
    spaceMatrix = arrangeMatrix(originalMatrix);
    printMatrix(originalMatrix, spaceMatrix);

    // Transpose matrix
    // REPLACE LINE BELOW if doing Part (e) without Part (f)!
    //System.out.println("rows: "+rows+"\nCols: "+ cols);

    int[][] resultMatrix = transposeMatrix(originalMatrix, rows, cols);
    // REPLACE LINE ABOVE if doing Part (e) without Part (f)!

    // Print transposed matrix
    System.out.println("\nTransposed matrix:");
    spaceMatrix = arrangeMatrix(resultMatrix);
    printMatrix(resultMatrix, spaceMatrix);
}// end main

  /** The method for printing the contents of a matrix */
  public static void printMatrix(int[][] matrix, String[][] arrangeMatrix) {
    for (int row = 0; row < matrix.length; row++) {
        for(int col = 0; col < matrix[row].length; col++){
        //System.out.println(""+Integer.toString(row) +"\t" + Integer.toString(col) + "\t" + arrangeMatrix[row][col]);
        System.out.print(arrangeMatrix[row][col] + matrix[row][col] + " ");
       // System.out.println("-" + arrangeMatrix[row][col] + "-");
         }// End for
        System.out.println();
     }// Emd for
      System.out.println();
   }//End method


  /** The method for transposing a matrix */
  // INSERT METHOD HERE for Part (f)!!!  :)

  //TransposeMatrix added Timothy Hydanus part f
  public static int[][] transposeMatrix(int[][] origMatrix, int origRows, int origCols){
     int[][] transMatrix = new int[origCols][origRows];
     for (int row = 0; row < origRows; row++) {
       for (int col = 0; col < origCols; col++) {
         transMatrix[col][row] = origMatrix[row][col];
       }
 }

return transMatrix;

}

 //Part D edit Timothy Hydanus. Adds extra spaces to allow neatly arranged print statements
 // * also incomplete - couldn't make it work .... Moving on to part c
public static String[][] arrangeMatrix(int[][] matrixIn){
   int row = matrixIn.length;
   int col = matrixIn[row-1].length;
   String activeIndex;
   String[][] spaceMatrix = new String[row][col];

   for(int rows = 0; rows < row; rows++){
   for (int cols = 0; cols < col; cols++) {
      activeIndex = Integer.toString(matrixIn[rows][cols]);
      //System.out.println("ActiveIndex = "+ activeIndex + "\tLength: " + Integer.toString(activeIndex.length()));
      spaceMatrix[rows][cols] = "";
      for (int i = 1; i < activeIndex.length(); i++){
         //System.out.print(Integer.toString(i));
         spaceMatrix[rows][cols] = spaceMatrix[rows][cols] + " ";
         //System.out.println("SpaceMatrix:"+spaceMatrix+"-");
      }// End for
   }
}
spaceMatrix = arrangeMatrix2(spaceMatrix);
return spaceMatrix;
}//End arrangeMatrix
public static String[][] arrangeMatrix2(String[][] matrixIn){
   String[][] matrixOut = matrixIn;
   String maxString = "";
   int diff = 0;
   for (int col = 0; col < matrixIn[0].length; col++){
      maxString = "";
      for(int row = 0; row < matrixIn.length; row++){
         if (matrixIn[row][col].length() > maxString.length() ){
            maxString = matrixOut[row][col];
         }// End if
      }// End for
      //Given the longest String we will now calculate the amount of ajustment needed
      for(int row = 0; row < matrixIn.length; row++){
         matrixOut[row][col] = "";
         if (matrixIn[row][col].length() < maxString.length() ){
            diff = maxString.length() - matrixIn[row][col].length();
            for(int i = 1; i < diff; i++){
               matrixOut[row][col] += " ";
            }//End For
         }// End if
         else{
            matrixOut[row][col] = " ";
         }
      }//End for
   }// End for



return matrixOut;
}//End arrangeMatrix2\
public static int[][] splitString(String[] matrixIn, int rows, int cols){
   int[][] matrixOut = new int[rows][cols];
   String[] splitResult = new String[cols];
   for(int i = 0; i < matrixIn.length; i++){
   splitResult = matrixIn[i].split(" ");
   for(int j = 0; j < splitResult.length; j++){
      matrixOut[i][j] = Integer.parseInt(splitResult[j]);
   }// End For
}// End for


   //for(int j=1; j < splitResult.length; j++){
      //splitResultint[j] = Integer.parseInt(splitResult[j]);

   return matrixOut;
}// End splitString


}//end code
