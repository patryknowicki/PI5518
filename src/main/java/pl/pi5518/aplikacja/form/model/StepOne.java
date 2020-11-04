package pl.pi5518.aplikacja.form.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class StepOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private String value;
    @OneToMany(mappedBy = "stepOne")
    private List<StepTwo> stepTwo;

    public List<StepTwo> getStepTwo() {
        return stepTwo;
    }


    public void setStepTwo(List<StepTwo> stepTwo) {
        this.stepTwo = stepTwo;
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
