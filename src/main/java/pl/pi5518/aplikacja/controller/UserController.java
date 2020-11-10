package pl.pi5518.aplikacja.controller;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pi5518.aplikacja.dto.AppUserDto;
import pl.pi5518.aplikacja.model.Token;
import pl.pi5518.aplikacja.repository.*;
import pl.pi5518.aplikacja.service.UserService;
import pl.pi5518.aplikacja.model.AppUser;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Collection;

@Controller
public class UserController {

    private UserService userService;
    private TokenRepo tokenRepo;
    private AppUserRepo appUserRepo;
    private NotebooksRepo notebooksRepo;
    private PcsRepo pcsRepo;
    private TabletsRepo tabletsRepo;


    public UserController(UserService userService, TokenRepo tokenRepo, AppUserRepo appUserRepo) {
        this.userService = userService;
        this.tokenRepo = tokenRepo;
        this.appUserRepo = appUserRepo;
    }

    // for REST
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return "hello dla wszystkich";
//    }

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/after-reg")
    public String homePageAfterReg() {
        return "index-after-reg";
    }

    @RequestMapping("/after-log")
    public String homePageAfterLog() {
        return "index-after-log";
    }


    @GetMapping("/hello")
    public String forUser(Principal principal, Model model) {
        model.addAttribute("name", principal.getName());
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        Object details = SecurityContextHolder.getContext().getAuthentication().getDetails();

        model.addAttribute("authorities", authorities);
        model.addAttribute("details", details);
        principal.getName();
        return "hello";
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

    @GetMapping("/token")
    public String singup(@RequestParam String value) {
        Token byValue = tokenRepo.findByValue(value);
        AppUser appUser = byValue.getAppUser();
        appUser.setEnabled(true);
        appUserRepo.save(appUser);
        return "hello";
    }

    @RequestMapping("/czat")
    public String czat() {
        return "czat";
    }

}
