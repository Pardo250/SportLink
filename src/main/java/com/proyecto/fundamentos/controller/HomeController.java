package com.proyecto.fundamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.fundamentos.repository.PartnerRepository;

@Controller
public class HomeController {
    private final PartnerRepository partnerRepository;

    public HomeController(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("partners", partnerRepository.findAll());
        return "home";
    }
}
