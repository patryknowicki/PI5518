package pl.pi5518.aplikacja.form.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class StepTwo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private String value;
    @ManyToOne
    private StepOne stepOne;

    @OneToMany(mappedBy = "stepTwo")
    private List<StepThree> stepThrees;


    public List<StepThree> getStepThrees() {
        return stepThrees;
    }

    public void setStepThrees(List<StepThree> stepThrees) {
        this.stepThrees = stepThrees;
    }

    public StepOne getStepOne() {
        return stepOne;
    }

    public void setStepOne(StepOne stepOne) {
        this.stepOne = stepOne;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
