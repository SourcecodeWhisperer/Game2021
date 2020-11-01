package TCPserver;

import TCPclient.TCPclient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
    public int port;
    public ServerSocket server;

    public TCPserver(int port) {
        this.port = port;
    }


    public void fileread(String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        Socket socket = this.acceptsocket();
        InputStream is = socket.getInputStream();


        int read = 0;
       do {
           read = is.read();
           if (read != -1){
               fos.write(read);
           }
       }while (read != -1);

    }
    private void recivesensordata ()throws IOException{
        Socket socket = this.acceptsocket();
        InputStream is = socket.getInputStream();

        DataInputStream dias = new DataInputStream(is);
        long timestampe = dias.readLong();
        float value = dias.readFloat();
        String sensorname = dias.readUTF();

        System.out.println(timestampe);
        System.out.println(value);
        System.out.println(sensorname);


    }

    private Socket acceptsocket() throws IOException {
        ServerSocket socket = new ServerSocket(this.port);
        return socket.accept();
    }
    public static void main(String[] args) throws IOException {
       TCPserver tcpse = new TCPserver(5555);
       tcpse.recivesensordata();
      // tcpse.fileread("C:\\Users\\Nasiem Ziad\\Documents\\test\\hallo3.txt");
    }
}