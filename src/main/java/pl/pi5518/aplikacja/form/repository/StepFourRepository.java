package pl.pi5518.aplikacja.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.form.model.StepFour;

import java.util.Optional;

public interface StepFourRepository extends JpaRepository<StepFour, Integer> {
    Optional<StepFour> findByStepThree_Number(String number);

}
