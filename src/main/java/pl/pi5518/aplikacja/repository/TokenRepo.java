package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pi5518.aplikacja.model.Token;

@Repository
public interface TokenRepo extends JpaRepository<Token, Long> {
    Token findByValue(String value);
}
