package com.proyecto.fundamentos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.proyecto.fundamentos.repository.*;
import com.proyecto.fundamentos.entity.*;

@Controller
@RequestMapping("/reservations")
public class ReservationController {

    private final ZoneRepository zoneRepository;
    private final SportRepository sportRepository;
    private final ScheduleRepository scheduleRepository;
    private final PaymentMethodRepository paymentMethodRepository;
    private final ReservationRepository reservationRepository;

    public ReservationController(ZoneRepository zoneRepository, SportRepository sportRepository,
                                  ScheduleRepository scheduleRepository, PaymentMethodRepository paymentMethodRepository,
                                  ReservationRepository reservationRepository) {
        this.zoneRepository = zoneRepository;
        this.sportRepository = sportRepository;
        this.scheduleRepository = scheduleRepository;
        this.paymentMethodRepository = paymentMethodRepository;
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public String showReservationForm(Model model) {
        model.addAttribute("zones", zoneRepository.findAll());
        model.addAttribute("sports", sportRepository.findAll());
        model.addAttribute("schedules", scheduleRepository.findAll());
        model.addAttribute("paymentMethods", paymentMethodRepository.findAll());
        model.addAttribute("reservation", new Reservation());
        return "reservation-form";
    }

    @PostMapping
    public String createReservation(@ModelAttribute Reservation reservation) {
        // Simulación de usuario (deberías obtenerlo de la sesión)
        User user = new User();
        user.setId(1L);
        reservation.setUser(user);
        reservation.setStatus("CONFIRMED");
        reservationRepository.save(reservation);
        return "redirect:/reservations/success";
    }

    @GetMapping("/success")
    public String reservationSuccess(Model model) {
        // Simulación de usuario
        User user = new User();
        user.setId(1L);
        
        Reservation lastReservation = reservationRepository.findAll().get(0);
        model.addAttribute("reservation", lastReservation);
        return "reservation-success";
    }
}
