import java.io.*;

public class TestFileStream {
  public static void main(String[] args) throws IOException {
    try (
      // Create an output stream to the file
      FileOutputStream output = new FileOutputStream("text.dat");
    ) {
      // Output values to the file
      //for (int i = 1; i <= 10; i++)
      //for (int i = 1; i <= 10; i++)
     String i = "a";
     output.write(i);
     i = "b";
     output.write(i);
     i = "c";
     output.write(i);
     i = "d";
     output.write(i);
     i = "e";
     output.write(i);
     i = "f";
     output.write(i);
     i = "g";
     output.write(i);


    }

    try (
      // Create an input stream for the file
      FileInputStream input = new FileInputStream("text.dat");
    ) {
      // Read values from the file
      int value;
      while ((value = input.read()) != -1)
        System.out.print(value + " ");
    }
  }
}
