package server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Speedy Team
 */
public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            Socket sock = server.accept(); // expect data for the server side

            BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream())); //reader

            String temp = ed.readLine(); // read line

            System.out.println("I Recieved: " + temp);

        } catch (Exception exc) {

        }
    }
}
