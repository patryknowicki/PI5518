package pl.pi5518.aplikacja.form.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.pi5518.aplikacja.form.model.StepThree;

import java.util.List;

public interface StepThreeRepository extends JpaRepository<StepThree, Integer> {
    List<StepThree> findAllByStepTwo_Number(String number);

}
