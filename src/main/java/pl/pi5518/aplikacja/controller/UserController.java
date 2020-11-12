package pl.pi5518.aplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pi5518.aplikacja.dto.AppUserDto;
import pl.pi5518.aplikacja.repository.*;
import pl.pi5518.aplikacja.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    private UserService userService;
    private TokenRepo tokenRepo;
    private AppUserRepo appUserRepo;

    public UserController(UserService userService, TokenRepo tokenRepo, AppUserRepo appUserRepo) {
        this.userService = userService;
        this.tokenRepo = tokenRepo;
        this.appUserRepo = appUserRepo;
    }

    @GetMapping("/sing-up")
    public String singup(Model model) {
        model.addAttribute("user", new AppUserDto());
        return "sing-up";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") @Valid AppUserDto appUserDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "sing-up";
        if (appUserRepo.findByMail(appUserDto.getMail()).isPresent()){
            bindingResult.rejectValue("mail", "wrongMail", "Podany e-mail już istnieje");
            return "sing-up";
        }
        if (appUserRepo.findByUsername(appUserDto.getUsername()).isPresent()){
            bindingResult.rejectValue("username", "wrongUsername", "Podany login już istnieje");
            return "sing-up";
        }
        if (!appUserDto.getPassword().equals(appUserDto.getConfirmPassword())){
            bindingResult.rejectValue("password", "wrongPassword", "Hasła nie są identyczne");
            return "sing-up";
        }
        System.out.println(appUserDto);
        userService.addUser(appUserDto);
        return "redirect:/after-reg";
    }
}
