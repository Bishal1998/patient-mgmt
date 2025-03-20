package com.pm.PatientService.service;

import com.pm.PatientService.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {
    List<PatientResponseDTO> getPatients();
}
