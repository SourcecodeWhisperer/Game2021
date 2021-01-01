package fileexchange;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileReciver {
    /**
     * Reciving a file from another procces
     * @param filename local file name
     * @param is conntent provider
     */
    void recviedFile (String filename ,InputStream is ) throws IOException;

}
