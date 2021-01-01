package sensordata;

import java.io.*;

public class SensorDataExchange implements SensorDataSender,SensorDataReciver{
    @Override
    public void sendSensorData(Sensordata data, OutputStream os) throws IOException {
        DataOutputStream daos = new DataOutputStream(os);

        daos.writeLong(data.getTimeStamp());
        daos.writeFloat(data.getValue());
        daos.writeUTF(data.getSensorName());

        daos.close();
    }

    @Override
    public Sensordata ReciveSensorData(InputStream is) throws IOException {
        DataInputStream dais = new DataInputStream(is);

        long timeStampe = dais.readLong();
        float value = dais.readFloat();
        String senorName = dais.readUTF();

        return new SensorDataImpl(timeStampe,value,senorName);

    }
}
