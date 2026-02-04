package mx.edu.itsoeh.vitalsigns.mapper;

import mx.edu.itsoeh.vitalsigns.dto.VitalSignRequest;
import mx.edu.itsoeh.vitalsigns.model.VitalSign;

public class VitalSignMapper {

    public static VitalSign toEntity(VitalSignRequest request) {
        VitalSign v = new VitalSign();
        v.setHeartRate(request.getHeartRate());
        v.setSpo2(request.getSpo2());
        v.setTemperature(request.getTemperature());
        return v;
    }
}
