// Server
import java.io.*;
import java.net.*;
import java.util.Scanner;

class ChatServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        Scanner scan = new Scanner(System.in);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        Thread send = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String msg = scan.nextLine();
                    out.println(msg);
                }
            }
        });

        send.start();

        Thread receive = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        String msg = in.readLine();
                        System.out.println("Client:" + msg);
                    } catch(Exception e) {}
                }
            }
        });

        receive.start();

    }
}


// Client
class ChatClient {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 5000);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

        Scanner scan = new Scanner(System.in);

        Thread send = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    String msg = scan.nextLine();
                    out.println(msg);
                }
            }
        });

        Thread receive = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    try {
                        String msg = in.readLine();
                        System.out.println("Server: " + msg);
                    } catch(Exception e) {}
                }
            }
        });

        send.start();
        receive.start();

    }
}