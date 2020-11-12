package pl.pi5518.aplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pi5518.aplikacja.dto.AppUserDto;
import pl.pi5518.aplikacja.model.AppUser;
import pl.pi5518.aplikacja.model.Token;
import pl.pi5518.aplikacja.repository.*;
import pl.pi5518.aplikacja.service.UserService;

import javax.validation.Valid;

@Controller
public class TokenController {

    private UserService userService;
    private TokenRepo tokenRepo;
    private AppUserRepo appUserRepo;

    public TokenController(UserService userService, TokenRepo tokenRepo, AppUserRepo appUserRepo) {
        this.userService = userService;
        this.tokenRepo = tokenRepo;
        this.appUserRepo = appUserRepo;
    }

    @GetMapping("/token")
    public String singup(@RequestParam String value) {
        Token byValue = tokenRepo.findByValue(value);
        AppUser appUser = byValue.getAppUser();
        appUser.setEnabled(true);
        appUserRepo.save(appUser);
        return "hello";
    }
}
