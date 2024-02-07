package VCSeperator;

import java.io.FileWriter;
import java.util.Scanner;

public class Separator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String input = scan.nextLine().toLowerCase();
        String vowels = "";
        String consonants = "";
        for(char c : input.toCharArray())
        {
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
            {
                vowels += c;
            }
            else if (Character.isLetter(c)) {
                consonants += c;
            }
        }
        try
        {
            FileWriter consonantsWriter = new FileWriter("src/VCSeperator/Consonants.txt");
            consonantsWriter.write(consonants.toString());
            consonantsWriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
            FileWriter vowelWriter = new FileWriter("src/VCSeperator/Vowels.txt");
            vowelWriter.write(vowels.toString());
            vowelWriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
