package app;

import java.io.IOException;

public interface TCPFileExchange {
    void sendFile2Host(String filename, String hostname, int port) throws IOException;
    void reciveFile(String filename,int port) throws IOException;
}
