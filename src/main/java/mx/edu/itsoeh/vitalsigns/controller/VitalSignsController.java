package mx.edu.itsoeh.vitalsigns.controller;

import mx.edu.itsoeh.vitalsigns.dto.VitalSignRequest;
import mx.edu.itsoeh.vitalsigns.mapper.VitalSignMapper;
import mx.edu.itsoeh.vitalsigns.model.VitalSign;
import mx.edu.itsoeh.vitalsigns.service.VitalSignsService;

import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vital-signs")
@CrossOrigin
public class VitalSignsController {

    private final VitalSignsService service;

    public VitalSignsController(VitalSignsService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<VitalSign> create(
            @Valid @RequestBody VitalSignRequest request) {

        VitalSign saved =
                service.save(VitalSignMapper.toEntity(request));

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(saved);
    }

    @GetMapping
    public List<VitalSign> getAll() {
        return service.findAll();
    }
}
