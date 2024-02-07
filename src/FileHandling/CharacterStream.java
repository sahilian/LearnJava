package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        // File paths
        String inputFile = "src/FileHandling/Input.txt";
        String outputFile = "src/FileHandling/Output.txt";

        try {
            // Creating FileReader and FileWriter objects
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            // Reading from input.txt and writing to output.txt
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            // Closing resources
            reader.close();
            writer.close();

            System.out.println("Content copied from " + inputFile + " to " + outputFile + " successfully.");
        } catch (IOException e) {
            // Handling IO exceptions
            e.printStackTrace();
        }
    }
}

class FileWriterReader{
    public static void main(String[] args) throws Exception
    {
        FileWriter writer = new FileWriter("src/FileHandling/Output.txt");
        writer.write("Hello World! Nice to meet you!");
        writer.close();
        FileReader reader = new FileReader("src/FileHandling/Output.txt");
        char[] a = new char[50];
        int numChars = reader.read(a);
        System.out.println(numChars); //Gives total number of characters
        //int numCharss = reader.read();
        //System.out.println(numCharss); //Gives the current index
        for(int i = 0;i<numChars;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("\n");
        for(char c : a)
        {
            System.out.print(c);
        }
    }
}
