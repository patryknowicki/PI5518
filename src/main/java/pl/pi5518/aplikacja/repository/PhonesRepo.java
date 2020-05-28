package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Phones;

public interface PhonesRepo extends JpaRepository<Phones, Integer> {
}


