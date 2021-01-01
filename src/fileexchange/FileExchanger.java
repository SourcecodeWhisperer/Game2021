package fileexchange;

import java.io.*;

public class FileExchanger implements FileSender, FileReciver{

    @Override
    public void sendFile(String filename, OutputStream os) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        this.streamData(fis,os);
        os.close();
    }

    @Override
    public void recviedFile(String filename, InputStream is) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        this.streamData(is,fos);
    }
    private void streamData(InputStream is, OutputStream os) throws IOException {
        int read = 0;
        do {
            read = is.read();
            if (read != -1){
                os.write(read);
            }
        }while(read != -1);
    }
}
