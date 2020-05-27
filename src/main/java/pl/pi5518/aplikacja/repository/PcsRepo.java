package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Pcs;

public interface PcsRepo extends JpaRepository<Pcs, Integer> {

}
