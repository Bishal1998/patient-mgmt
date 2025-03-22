package com.pm.PatientService.mapper;

import com.pm.PatientService.dto.PatientRequestDTO;
import com.pm.PatientService.dto.PatientResponseDTO;
import com.pm.PatientService.model.Patient;

import java.time.LocalDate;

public class PatientMapper {
    public static PatientResponseDTO mapToPatientDto(Patient patient) {
        return new PatientResponseDTO(
                patient.getId().toString(),
                patient.getName(),
                patient.getAddress(),
                patient.getEmail(),
                patient.getDateOfBirth().toString()
        );
    }

    public static Patient mapToPatient(PatientRequestDTO patientRequestDTO){
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

        return patient;
    }
}
