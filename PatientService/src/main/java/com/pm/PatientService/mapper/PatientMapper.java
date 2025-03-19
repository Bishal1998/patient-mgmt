package com.pm.PatientService.mapper;

import com.pm.PatientService.dto.PatientResponseDTO;
import com.pm.PatientService.model.Patient;

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

//    public static Patient mapToPatient(PatientResponseDTO patientResponseDTO){
//        return new Patient(
//                patientResponseDTO.getId(),
//                patientResponseDTO.getName(),
//                patientResponseDTO.getAddress(),
//                patientResponseDTO.getEmail(),
//                patientResponseDTO.getDateOfBirth()
//        );
//}
}
