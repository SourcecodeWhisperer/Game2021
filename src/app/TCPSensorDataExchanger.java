package app;

import sensordata.Sensordata;

import java.io.IOException;

public interface TCPSensorDataExchanger {
    void sendSensorData(Sensordata data,String hostname,int port) throws IOException;
    void reciveSensorData(int port) throws IOException;
}
