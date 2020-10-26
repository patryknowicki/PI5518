package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pi5518.aplikacja.model.AppUser;
import pl.pi5518.aplikacja.model.Token;

import java.util.Optional;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long> {


    Optional<AppUser> findByUsername(String username);

    Optional<AppUser> findByMail(String mail);
}
