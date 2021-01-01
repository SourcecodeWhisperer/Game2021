package app;

import fileexchange.FileExchanger;
import fileexchange.FileReciver;
import fileexchange.FileSender;
import tcp.Client;
import tcp.Connection;
import tcp.Server;
import tcp.TCPConnector;

import java.io.IOException;

public class TCPFileExchangeImpl implements TCPFileExchange {

    @Override
    public void sendFile2Host(String filename, String hostname, int port) throws IOException {
        Client client = new TCPConnector();
        Connection connection = client.connect(hostname,port);

        FileSender fileSender = new FileExchanger();
        fileSender.sendFile(filename,connection.getOutputStream());
    }

    @Override
    public void reciveFile(String filename, int port) throws IOException {
        Server server = new TCPConnector();
        Connection connection = server.acceptConnection(port);

        FileReciver fileReciver = new FileExchanger();
        fileReciver.recviedFile(filename,connection.getInputStream());

    }
}
