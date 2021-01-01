package sensordata;

public class SensorDataImpl implements Sensordata {

    private final long timestamp;
    private final float value;
    private final String sensorname;

    SensorDataImpl(long timestamp, float value, String sensorname){
        this.timestamp = timestamp;
        this.value = value;
        this.sensorname = sensorname;

    }
    @Override
    public long getTimeStamp() {
        return this.timestamp;
    }

    @Override
    public float getValue() {
        return this.value;
    }

    @Override
    public String getSensorName() {
        return this.sensorname;
    }


}
