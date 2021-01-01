package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface Connection {
    OutputStream getOutputStream() throws IOException;

    InputStream getInputStream() throws IOException;
}
