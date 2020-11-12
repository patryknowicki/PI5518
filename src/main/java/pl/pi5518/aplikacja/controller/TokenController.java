package pl.pi5518.aplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.pi5518.aplikacja.model.AppUser;
import pl.pi5518.aplikacja.model.Token;
import pl.pi5518.aplikacja.repository.*;

@Controller
public class TokenController {

    private TokenRepo tokenRepo;
    private AppUserRepo appUserRepo;

    public TokenController(TokenRepo tokenRepo, AppUserRepo appUserRepo) {
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
