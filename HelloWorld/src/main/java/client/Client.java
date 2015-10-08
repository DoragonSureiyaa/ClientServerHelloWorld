package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author Speedy Team
 */
public class Client {

    public static void main(String[] args) {
        try {
            Socket sock =  new Socket("localhost", 9999);

            PrintStream pr = new PrintStream(sock.getOutputStream());
            System.out.println("Connection with the server.");

            //stream of data - stream reader
            InputStreamReader rd = new InputStreamReader(System.in);
            BufferedReader ed = new BufferedReader(rd);

            String temp = ed.readLine(); // read line

            pr.println(temp); // send line
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
