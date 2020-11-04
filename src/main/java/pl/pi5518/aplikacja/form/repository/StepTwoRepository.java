package pl.pi5518.aplikacja.form.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.form.model.StepTwo;

import java.util.List;
import java.util.Optional;

public interface StepTwoRepository extends JpaRepository<StepTwo, Integer> {
    List<StepTwo> findAllByStepOne_Number(String number);
    Optional<StepTwo> findByNumber(String number);
}
