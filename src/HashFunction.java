import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        try {
            // Create a SHA-256 instance
            MessageDigest sha256Hash = MessageDigest.getInstance("SHA-256");

            // ComputeHash - returns byte array
            byte[] bytes = sha256Hash.digest(password.getBytes());

            // Convert byte array to a hexadecimal string
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xff & bytes[i]);
                if (hex.length() == 1) {
                    builder.append('0');
                }
                builder.append(hex);
            }
            System.out.println("Hashed Password: " + builder.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}