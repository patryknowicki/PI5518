package pl.pi5518.aplikacja.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.pi5518.aplikacja.form.oth.StepOneForm;
import pl.pi5518.aplikacja.form.oth.StepThreeForm;
import pl.pi5518.aplikacja.form.oth.StepTwoForm;
import pl.pi5518.aplikacja.form.repository.StepFourRepository;
import pl.pi5518.aplikacja.form.repository.StepOneRepository;
import pl.pi5518.aplikacja.form.repository.StepThreeRepository;
import pl.pi5518.aplikacja.form.repository.StepTwoRepository;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FormController {
    private StepOneRepository stepOneRepository;
    private StepTwoRepository stepTwoRepository;
    private StepThreeRepository stepThreeRepository;
    private StepFourRepository stepFourRepository;

    @Autowired
    public FormController(StepOneRepository stepOneRepository, StepTwoRepository stepTwoRepository, StepThreeRepository stepThreeRepository, StepFourRepository stepFourRepository) {
        this.stepOneRepository = stepOneRepository;
        this.stepTwoRepository = stepTwoRepository;
        this.stepThreeRepository = stepThreeRepository;
        this.stepFourRepository = stepFourRepository;
    }

    @GetMapping("/stepone")
    public String stepOnePage(Model model) {
        StepOneForm stepOneForm = new StepOneForm();
        model.addAttribute("stepOneOptions", stepOneRepository.findAll());
        model.addAttribute("stepOneForm", stepOneForm);
        return "step-one";
    }

    @PostMapping("/stepone")
    public String stepOneProcessing(@ModelAttribute("stepOneForm") StepOneForm stepOneForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "step-one";
        }
        if (stepOneForm.getNumber().equals("404")){
            return "redirect:/stepone";
        }
        String redirect = "redirect:/steptwo/" + stepOneForm.getNumber();
        return redirect;
    }

    @GetMapping("/steptwo/{stepOneNumber}")
    public String stepTwoPage(Model model, @PathVariable("stepOneNumber") String stepOneNumber) {
        StepTwoForm stepTwoForm = new StepTwoForm();
        model.addAttribute("previousStepValue", stepOneRepository.findByNumber(stepOneNumber).get().getValue());
        model.addAttribute("stepTwoForm", stepTwoForm);
        model.addAttribute("stepTwoOptions", stepTwoRepository.findAllByStepOne_Number(stepOneNumber));
        return "step-two";
    }

    @PostMapping("/steptwo")
    public String stepTwoProcessing(@ModelAttribute("stepTwoForm") StepTwoForm stepTwoForm, BindingResult bindingResult, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            return "step-one";
        }
        if (stepTwoForm.getNumber().equals("404")){
            return "redirect:"+httpServletRequest.getHeader("Referer");
        }
        String redirect = "redirect:/stepthree/" + stepTwoForm.getNumber();
        return redirect;
    }

    @GetMapping("/stepthree/{stepTwoNumber}")
    public String stepThreePage(Model model, @PathVariable("stepTwoNumber") String stepTwoNumber) {
        StepThreeForm stepThreeForm = new StepThreeForm();
        model.addAttribute("previousStepValue", stepTwoRepository.findByNumber(stepTwoNumber).get().getValue());
        model.addAttribute("stepThreeForm", stepThreeForm);
        model.addAttribute("stepThreeOptions", stepThreeRepository.findAllByStepTwo_Number(stepTwoNumber));
        return "step-three";
    }

    @PostMapping("/stepthree")
    public String stepTwoProcessing(@ModelAttribute("stepThreeForm") StepThreeForm stepThreeForm, BindingResult bindingResult, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            return "step-one";
        }
        if (stepThreeForm.getNumber().equals("404")){
            return "redirect:"+httpServletRequest.getHeader("Referer");
        }
        String redirect = "redirect:/stepfour/" + stepThreeForm.getNumber();
        return redirect;
    }

    @GetMapping("/stepfour/{stepThreeNumber}")
    public String stepFourPage(Model model, @PathVariable("stepThreeNumber") String stepThreeNumber) {
        model.addAttribute("stepFourOption", stepFourRepository.findByStepThree_Number(stepThreeNumber).get().getValue());
        return "step-four";
    }
}
