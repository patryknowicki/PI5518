package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Pcs;
import pl.pi5518.aplikacja.databases.Tablets;

import java.util.List;

public interface PcsRepo extends JpaRepository<Pcs, Integer> {
    List<Pcs> findAllByproducent(String search);
}
