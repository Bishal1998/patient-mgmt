package com.pm.PatientService.service.impl;

import com.pm.PatientService.dto.PatientResponseDTO;
import com.pm.PatientService.mapper.PatientMapper;
import com.pm.PatientService.model.Patient;
import com.pm.PatientService.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl {
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::mapToPatientDto).toList();
    }
}
