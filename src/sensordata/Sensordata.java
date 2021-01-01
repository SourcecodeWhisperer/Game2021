package sensordata;

public interface Sensordata {
    /**
     *
     * @return Time Stampe
     */
    long getTimeStamp();
    /**
     *
     * @return Value from Sensor
     */
    float getValue();
    /**
     *
     * @return Name of Sensor
     */
    String getSensorName();
}
