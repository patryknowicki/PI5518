package pl.pi5518.aplikacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.pi5518.aplikacja.databases.Notebooks;
import pl.pi5518.aplikacja.repository.NotebooksRepo;

@Controller
public class AddControllerPioter {
    private NotebooksRepo notebooksRepo;

    @Autowired
    public AddControllerPioter(NotebooksRepo notebooksRepo) {
        this.notebooksRepo = notebooksRepo;
    }
    @GetMapping("/newNotebook")
    public String showForm(Model model){

        Notebooks notebooks = new Notebooks();
        model.addAttribute("newNotebook",notebooks);
        return "add-notebooks";
    }
    @PostMapping("/newNotebook")
    public String addNotebooks(@ModelAttribute("newNotebook") Notebooks notebooks){
        notebooksRepo.save(notebooks);
        return "redirect:/list-notebooks";
    }
    @RequestMapping("/list-notebooks")
    public String list(Model model) {

        for (Notebooks notebooks : notebooksRepo.findAll()) {
            System.out.println(notebooks);
        }
        model.addAttribute("notebooks", notebooksRepo.findAll());
        return "list-notebooks";
    }
}
