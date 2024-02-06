package FileHandling;

import javax.annotation.processing.Filer;
import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws Exception {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("src\\FileHandling\\Input.txt");
            out = new FileOutputStream("src\\FileHandling\\Output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            // Close streams only if they are not null
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}

