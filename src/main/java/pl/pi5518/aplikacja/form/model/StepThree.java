package pl.pi5518.aplikacja.form.model;

import javax.persistence.*;

@Entity
public class StepThree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String number;
    private String value;
    @ManyToOne
    private StepTwo stepTwo;
    public Integer getId() {
        return id;
    }

    @OneToOne(mappedBy = "stepThree")
    private StepFour stepFour;


    public StepFour getStepFour() {
        return stepFour;
    }

    public void setStepFour(StepFour stepFour) {
        this.stepFour = stepFour;
    }

    public StepTwo getStepTwo() {
        return stepTwo;
    }

    public void setStepTwo(StepTwo stepTwo) {
        this.stepTwo = stepTwo;
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
