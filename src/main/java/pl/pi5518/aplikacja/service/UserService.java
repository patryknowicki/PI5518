package pl.pi5518.aplikacja.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.pi5518.aplikacja.model.AppUser;
import pl.pi5518.aplikacja.model.Token;
import pl.pi5518.aplikacja.repository.AppUserRepo;
import pl.pi5518.aplikacja.repository.TokenRepo;

import javax.mail.MessagingException;
import java.util.UUID;

@Service
public class UserService {

    private TokenRepo tokenRepo;
    private MailService mailService;

    private AppUserRepo appUserRepo;
    private PasswordEncoder passwordEncoder;

    public UserService(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder, TokenRepo tokenRepo, MailService mailService) {
        this.appUserRepo = appUserRepo;
        this.passwordEncoder = passwordEncoder;
        this.tokenRepo = tokenRepo;
        this.mailService = mailService;
    }

    public void addUser(AppUser appUser) {
        appUser.setPassword(passwordEncoder.encode(appUser.getPassword()));
        appUser.setRole("ROLE_USER");
        appUserRepo.save(appUser);
        sendToken(appUser);
    }

    private void sendToken(AppUser appUser) {
        String tokenValue = UUID.randomUUID().toString();
        Token token = new Token();
        token.setValue(tokenValue);
        token.setAppUser(appUser);
        tokenRepo.save(token);
        String url = "http://localhost:8080/token?value=" + tokenValue;

        try {
            mailService.sendMail(appUser.getMail(), "Potwierdzenie rejestracji w serwisie", "Potwierdź rejestrację klikając w link: " + url + " lub zignoruj tę wiadomość", false);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
