package com.example.sportlink.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sportlink.repository.PartnerRepository;

@Controller
public class HomeController {
    private final PartnerRepository partnerRepo;
    public HomeController(PartnerRepository partnerRepo){ this.partnerRepo = partnerRepo; }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("partners", partnerRepo.findAll());
        return "index";
    }

    @GetMapping("/partners")
    public String partners(Model model){
        model.addAttribute("partners", partnerRepo.findAll());
        return "partners";
    }
}
