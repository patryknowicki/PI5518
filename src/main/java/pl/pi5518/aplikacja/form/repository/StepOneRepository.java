package pl.pi5518.aplikacja.form.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.form.model.StepOne;

import java.util.Optional;

public interface StepOneRepository extends JpaRepository<StepOne, Integer> {
    Optional<StepOne> findByNumber(String number);
}
