package mx.edu.itsoeh.vitalsigns.dto;

import jakarta.validation.constraints.*;

public class VitalSignRequest {

    @Min(30)
    @Max(220)
    private int heartRate;

    @Min(70)
    @Max(100)
    private int spo2;

    @Min(30)
    @Max(45)
    private double temperature;

    public int getHeartRate() {
        return heartRate;
    }

    public int getSpo2() {
        return spo2;
    }

    public double getTemperature() {
        return temperature;
    }
}
