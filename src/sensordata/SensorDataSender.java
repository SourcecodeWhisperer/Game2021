package sensordata;

import java.io.IOException;
import java.io.OutputStream;

public interface SensorDataSender {
    void sendSensorData(Sensordata data, OutputStream os) throws IOException;
}
