package com.example.sportlink.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import com.example.sportlink.repository.UserRepository;
import com.example.sportlink.model.User;

@Controller
public class AuthController {
    private final UserRepository userRepo;
    public AuthController(UserRepository userRepo){ this.userRepo = userRepo; }

    @GetMapping("/register")
    public String registerForm(Model model){ model.addAttribute("user", new User()); return "register"; }

    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute User user, Model model){
        if(userRepo.findByEmail(user.getEmail()).isPresent()){
            model.addAttribute("error", "Email ya registrado");
            return "register";
        }
        userRepo.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginForm(){ return "login"; }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String email, @RequestParam String password, HttpSession session, Model model){
        var opt = userRepo.findByEmail(email);
        if(opt.isPresent() && opt.get().getPassword().equals(password)){
            session.setAttribute("user", opt.get());
            return "redirect:/dashboard";
        }
        model.addAttribute("error","Credenciales inválidas");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){ session.invalidate(); return "redirect:/"; }
}
