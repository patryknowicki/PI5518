/* package pl.pi5518.aplikacja;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.pi5518.aplikacja.model.AppUser;
import pl.pi5518.aplikacja.repository.AppUserRepo;

@Configuration
public class Start {
    private AppUserRepo appUserRepo;


    public Start(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder) {

        AppUser appUserAdmin = new AppUser();
        appUserAdmin.setUsername("Admin");
        appUserAdmin.setPassword(passwordEncoder.encode("Admin123"));
        appUserAdmin.setRole("ROLE_ADMIN");
        appUserAdmin.setEnabled(true);


        AppUser appUserUser = new AppUser();
        appUserUser.setUsername("User");
        appUserUser.setPassword(passwordEncoder.encode("User123"));
        appUserUser.setRole("ROLE_USER");
        appUserUser.setEnabled(true);

        appUserRepo.save(appUserAdmin);
        appUserRepo.save(appUserUser);
    }
}


 */