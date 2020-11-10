package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Tablets;

import java.util.List;

public interface TabletsRepo extends JpaRepository<Tablets, Integer> {
    List<Tablets> findAllByproducent(String search);
}
