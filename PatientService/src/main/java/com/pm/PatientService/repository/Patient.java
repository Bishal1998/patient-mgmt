package com.pm.PatientService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Patient extends JpaRepository<Patient, UUID> {
}
