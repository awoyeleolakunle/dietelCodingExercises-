package MsgAcrsDevices;

// A Java program for a Client
import java.io.*;
import java.net.*;

    public class SendFilesThroughPort {
        // initialize socket and input output streams
        private Socket socket = null;
        private DataInputStream input = null;
        private DataOutputStream out = null;

        // constructor to put ip address and port
        public SendFilesThroughPort(String address, int port)
        {
            // establish a connection
            try {
                socket = new Socket(address, port);
                System.out.println("Connected");

                // takes input from terminal
                input = new DataInputStream(System.in);

                // sends output to the socket
                out = new DataOutputStream(
                        socket.getOutputStream());
            }
            catch (UnknownHostException u) {
                System.out.println(u);
                return;
            }
            catch (IOException i) {
                System.out.println(i);
                return;
            }

            // string to read message from input
            String line = "Hello";

            // keep reading until "Over" is input
            while (!line.equals("Over")) {
                try {
                    line = input.readLine();
                    out.writeUTF(line);
                }
                catch (IOException i) {
                    System.out.println(i);
                }
            }

            // close the connection
            try {
                input.close();
                out.close();
                socket.close();
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }

        public static void main(String args[])
        {
            SendFilesThroughPort sendFilesThroughPort = new SendFilesThroughPort("172.16.0.159", 5000);

        }

    }
