package com.pm.PatientService.service;

import com.pm.PatientService.dto.PatientResponseDTO;
import com.pm.PatientService.mapper.PatientMapper;
import com.pm.PatientService.model.Patient;
import com.pm.PatientService.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::mapToPatientDto).toList();
    }
}
