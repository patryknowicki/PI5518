package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.databases.Notebooks;

import java.util.List;

public interface NotebooksRepo extends JpaRepository<Notebooks, Integer> {
    List<Notebooks> findAllByGrupa_produktowa (String wyszukaj);
}
