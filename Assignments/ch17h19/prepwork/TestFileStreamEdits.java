import java.io.*;
import java.util.Scanner;

public class TestFileStreamEdits {
  public static void main(String[] args) throws IOException {
     Scanner prompt = new Scanner(System.in);
    /*(try (
      // Create an output stream to the file
      FileOutputStream output = new FileOutputStream("temp.dat");
    ) {
      // Output values to the file
      for (int i = 1; i <= 10; i++)
        output.write(i);
    }
    */
    System.out.println("Enter the name of the file you wish to view:");
    System.out.println("Include the file extension");
    String fileName = prompt.next();
    try (
      // Create an input stream for the file
      FileInputStream input = new FileInputStream(fileName);
    ) {
      // Read values from the file
      int value;
      while ((value = input.read()) != -1)
        System.out.print(value + " ");
    }
  }
}
