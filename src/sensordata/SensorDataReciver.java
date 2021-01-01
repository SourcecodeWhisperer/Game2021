package sensordata;

import java.io.IOException;
import java.io.InputStream;

public interface SensorDataReciver {
    Sensordata ReciveSensorData(InputStream is) throws IOException;
}
