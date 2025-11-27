package com.example.sportlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

import com.example.sportlink.repository.*;
import com.example.sportlink.model.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class ReservationController {
    private final ZoneRepository zoneRepo;
    private final SportRepository sportRepo;
    private final ScheduleRepository scheduleRepo;
    private final PaymentMethodRepository paymentRepo;
    private final ReservationRepository reservationRepo;

    public ReservationController(ZoneRepository zoneRepo, SportRepository sportRepo,
        ScheduleRepository scheduleRepo, PaymentMethodRepository paymentRepo,
        ReservationRepository reservationRepo){
        this.zoneRepo = zoneRepo; this.sportRepo = sportRepo; this.scheduleRepo = scheduleRepo;
        this.paymentRepo = paymentRepo; this.reservationRepo = reservationRepo;
    }

    @GetMapping("/new")
    public String newReservation(Model model){
        model.addAttribute("zones", zoneRepo.findAll());
        model.addAttribute("sports", sportRepo.findAll());
        model.addAttribute("schedules", scheduleRepo.findAll());
        model.addAttribute("payments", paymentRepo.findAll());
        model.addAttribute("reservation", new Reservation());
        return "make-reservation";
    }

    @PostMapping("/save")
    public String saveReservation(@ModelAttribute Reservation reservation, HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        if(user == null) { return "redirect:/login"; }
        reservation.setUser(user);
        reservation.setStatus("CONFIRMED");
        reservationRepo.save(reservation);
        return "redirect:/reservations/mine";
    }

    @GetMapping("/mine")
    public String myReservations(HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        if(user == null) return "redirect:/login";
        List<Reservation> list = reservationRepo.findByUserId(user.getId());
        model.addAttribute("reservations", list);
        return "my-reservations";
    }
}
