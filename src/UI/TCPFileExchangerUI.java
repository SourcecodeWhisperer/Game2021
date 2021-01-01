package UI;

import app.TCPFileExchange;
import app.TCPFileExchangeImpl;

import java.io.IOException;

public class TCPFileExchangerUI {
   public static void main(String[] args) throws IOException {
       if(args.length < 2){
           System.err.println("min 2 Arguments");
           return;
       }

       String filename = args[0];
       String hostname = null;
       int port = -1;

       String portString = null;

       if(args.length == 3){
           hostname = args[1];
           portString = args[2];
       }else if (args.length ==2){
           portString = args[1];
       }
       port = Integer.parseInt(portString);
       TCPFileExchange tcpFileExchange = new TCPFileExchangeImpl();
       if(hostname == null){
           tcpFileExchange.reciveFile(filename,port);
       }else{
           tcpFileExchange.sendFile2Host(filename,hostname,port);
       }
   }
}
