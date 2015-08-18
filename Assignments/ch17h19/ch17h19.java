//Code by Timothy Hydanus based on textbook example:

//http://liang.armstrong.edu:8080/LiveRun/faces/LiveExample.xhtml?programName=TestFileStream&username=slide&header=on
//End based on:
//http://stackoverflow.com/questions/12310017/how-to-convert-a-byte-to-its-binary-string-representation

/*The Assignment
Whirte a programm that prompts the user to enter a file name, reads bytes from the file and displays each byte\s hex represntation. (hint: you can first convert the byt valuue into an 8 bit string in toa two digit hex string)

*/
import java.io.*;
import java.util.Scanner;

public class ch17h19{
   public static void main(String[] args){
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
       byte b1;
       String s1;
       while ((b1 = input.readByte()) != -1)

          s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
         System.out.print(s1 + " ");
     }
   }
 }
