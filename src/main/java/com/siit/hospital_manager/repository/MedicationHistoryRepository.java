package com.siit.hospital_manager.repository;

import com.siit.hospital_manager.model.MedicationHistory;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicationHistoryRepository extends JpaRepository <MedicationHistory, Integer> {

    List<MedicationHistory> findAllByPatient(Integer id);



}
