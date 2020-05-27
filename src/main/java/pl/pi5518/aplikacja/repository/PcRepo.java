package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Pc;

import java.util.List;

public interface PcRepo extends JpaRepository<Pc, Integer> {

}
