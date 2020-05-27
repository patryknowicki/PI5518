package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Tablets;

public interface TabletsRepo extends JpaRepository<Tablets, Integer> {
}
