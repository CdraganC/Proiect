package com.siit.hospital_manager.controller;

import com.siit.hospital_manager.model.dto.MedicationHistoryDto;
import com.siit.hospital_manager.service.MedicationHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.security.Principal;
import java.util.List;

@RequestMapping("/medication")
@Controller
@RequiredArgsConstructor
public class MedicationHistoryController {
    private final MedicationHistoryService medicationHistoryService;
    public List<MedicationHistoryDto> findAll () {
        return medicationHistoryService.findAll();


    }
    @GetMapping("/viewAll")
    public String findAllByPatient(Model model) {
        List<MedicationHistoryDto> medicationHistory = medicationHistoryService.findAll();
        model.addAttribute("medications", medicationHistory);

        return "/medication/viewAll";
    }
}
