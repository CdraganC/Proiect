package com.siit.hospital_manager.model.dto;

import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateAppointmentDto {

    private String date;
    private Patient patient;
    private Doctor doctor;
}
