package fileexchange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public interface FileSender {
    /**
     * Send a File from a local Programm to another procces
     * @param filename local file name
     * @param os connection / stream to remote entity
     */
    void sendFile(String filename, OutputStream os) throws IOException;
}
