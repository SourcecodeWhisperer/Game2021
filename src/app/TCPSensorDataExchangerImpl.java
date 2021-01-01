package app;

import sensordata.SensorDataExchange;
import sensordata.SensorDataReciver;
import sensordata.SensorDataSender;
import sensordata.Sensordata;
import tcp.Client;
import tcp.Connection;
import tcp.Server;
import tcp.TCPConnector;

import java.io.IOException;

public class TCPSensorDataExchangerImpl implements TCPSensorDataExchanger {
    @Override
    public void sendSensorData(Sensordata data, String hostname, int port) throws IOException {
        Client client = new TCPConnector();
        Connection connection = client.connect(hostname,port);

        SensorDataSender sensorDataSender = new SensorDataExchange();
        sensorDataSender.sendSensorData(data,connection.getOutputStream());
    }

    @Override
    public void reciveSensorData(int port) throws IOException {
        Server server = new TCPConnector();
        Connection connection = server.acceptConnection(port);

        SensorDataReciver sensorDataReciver = new SensorDataExchange();
        sensorDataReciver.ReciveSensorData(connection.getInputStream());

    }
}
