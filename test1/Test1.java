import java.util.Scanner;



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



    // Create originalMatrix as rectangular two dimensional array
    int[][] originalMatrix = new int[rows][cols];

    // Assign random values to originalMatrix
    for (int row = 0; row < originalMatrix.length; row++)
      for (int col = 0; col < originalMatrix[row].length; col++) {
        originalMatrix[row][col] = (int) (Math.random() * 1000);
      }

    // Print original matrix
    System.out.println("\nOriginal matrix:");
    printMatrix(originalMatrix);

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
        System.out.print(arrangeMatrix[row][col] + matrix[row][col]);
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
 //Part D edit Timothy Hydanus. Adds extra spaces to allow neatly arranged print statements
public static String[][] arrangeMatrix(int[][] matrixIn){
   int row = matrixIn.length;
   int col = matrixIn[row].length;
   String activeIndex;
   String[][] spaceMatrix;
   for(int rows = 0; rows < row; rows++){
   for (int cols = 0; cols < col; cols++) {
      activeIndex = matrixIn[rows][cols];
      for (int i = 0; i < activeIndex.length(); i++){
         spaceMatrix[rows][cols] += " ";
      }// End for
return spaceMatrix;
}//End arrangeMatrix
}// End transposeMatrix
}//end code
