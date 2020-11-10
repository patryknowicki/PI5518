package pl.pi5518.aplikacja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pi5518.aplikacja.databases.Notebooks;

import java.util.List;

@Repository
public interface NotebooksRepo extends JpaRepository<Notebooks, Integer> {
    List<Notebooks> findAllByproducent(String search);

}
