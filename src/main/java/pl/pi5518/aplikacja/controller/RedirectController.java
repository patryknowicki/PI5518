package pl.pi5518.aplikacja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pi5518.aplikacja.repository.*;
import pl.pi5518.aplikacja.service.UserService;


@Controller
public class RedirectController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/after-reg")
    public String homePageAfterReg() {
        return "index-after-reg";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/after-log")
    public String homePageAfterLog() {
        return "index-after-log";
    }

    @RequestMapping("/after-logout")
    public String homePageAfterLogout() {
        return "index-after-logout";
    }

    @RequestMapping("/czat")
    public String czat() { return "czat"; }

}
