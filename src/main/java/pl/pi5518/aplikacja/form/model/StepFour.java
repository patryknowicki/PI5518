package pl.pi5518.aplikacja.form.model;

import javax.persistence.*;

@Entity
public class StepFour {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String key;
    private String value;

    @OneToOne
    private StepThree stepThree;



    public StepThree getStepThree() {
        return stepThree;
    }

    public void setStepThree(StepThree stepThree) {
        this.stepThree = stepThree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
