package mx.edu.itsoeh.vitalsigns.service;

import mx.edu.itsoeh.vitalsigns.model.VitalSign;
import mx.edu.itsoeh.vitalsigns.repository.VitalSignsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignsService {

    private final VitalSignsRepository repository;

    public VitalSignsService(VitalSignsRepository repository) {
        this.repository = repository;
    }

    public VitalSign save(VitalSign vitalSign) {
        return repository.save(vitalSign);
    }

    public List<VitalSign> findAll() {
        return repository.findAll();
    }
}
