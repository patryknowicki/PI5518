package pl.pi5518.aplikacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.pi5518.aplikacja.databases.Notebooks;
import pl.pi5518.aplikacja.databases.Pcs;
import pl.pi5518.aplikacja.databases.Tablets;
import pl.pi5518.aplikacja.repository.NotebooksRepo;
import pl.pi5518.aplikacja.repository.PcsRepo;
import pl.pi5518.aplikacja.repository.TabletsRepo;

@Controller
public class DbController {
    private NotebooksRepo notebooksRepo;
    private TabletsRepo tabletsRepo;
    private PcsRepo pcsRepo;

    @Autowired
    public DbController(NotebooksRepo notebooksRepo, TabletsRepo tabletsRepo, PcsRepo pcsRepo) {
        this.notebooksRepo = notebooksRepo;
        this.tabletsRepo = tabletsRepo;
        this.pcsRepo = pcsRepo;
    }

    @GetMapping("/newNotebook")
    public String showFormAddNotebook(Model model) {
        Notebooks notebooks = new Notebooks();
        model.addAttribute("newNotebook", notebooks);
        return "add-notebooks";
    }

    @GetMapping("/newTablet")
    public String showFormAddTablet(Model model) {
        Tablets tablets = new Tablets();
        model.addAttribute("newTablet", tablets);
        return "add-tablets";
    }

    @GetMapping("/newPc")
    public String showFormAddPc(Model model) {
        Pcs pcs = new Pcs();
        model.addAttribute("newPc", pcs);
        return "add-pcs";
    }

    @PostMapping("/newNotebook")
    public String addNotebooks(@ModelAttribute("newNotebook") Notebooks notebooks) {
        notebooksRepo.save(notebooks);
        return "redirect:/list-notebooks";
    }

    @PostMapping("/newTablet")
    public String addTablets(@ModelAttribute("newTablet")Tablets tablets){
        tabletsRepo.save(tablets);
        return "redirect:/list-tablets";
    }

    @PostMapping("/newPc")
    public String addPc(@ModelAttribute("newPc")Pcs pcs){
        pcsRepo.save(pcs);
        return "redirect:/list-pcs";
    }
    @RequestMapping("/list-notebooks")
    public String listNotebooks(Model model) {

        for (Notebooks notebooks : notebooksRepo.findAll()) {
            System.out.println(notebooks);
        }
        model.addAttribute("notebooks", notebooksRepo.findAll());
        return "list-notebooks";
    }

    @RequestMapping("/list-tablets")
    public String listTablets(Model model){
        for (Tablets tablets : tabletsRepo.findAll()){
            System.out.println(tablets);
        }
        model.addAttribute("tablets", tabletsRepo.findAll());
        return "list-tablets";
    }

    @RequestMapping("/list-pcs")
    public String listPcs(Model model){
        for (Pcs pcs : pcsRepo.findAll()){
            System.out.println(pcs);
        }
        model.addAttribute("pcs", pcsRepo.findAll());
        return "list-pcs";
    }
    @RequestMapping("/delete-notebook")
    public String deleteNotebook(@RequestParam("id") Integer id, Model model){
        notebooksRepo.deleteById(id);

        model.addAttribute("notebooks", notebooksRepo.findAll());
        return "list-notebooks";
    }
    @RequestMapping("/delete-tablet")
    public String deleteTablet(@RequestParam("id") Integer id, Model model){
        tabletsRepo.deleteById(id);

        model.addAttribute("tablets", tabletsRepo.findAll());
        return "list-tablets";
    }
    @RequestMapping("/delete-pc")
    public String deletePc(@RequestParam("id") Integer id, Model model){
        pcsRepo.deleteById(id);

        model.addAttribute("pcs", pcsRepo.findAll());
        return "list-pcs";
    }
    @RequestMapping("/search")
    public String search(@RequestParam("criterion") String criterion, Model model){
        model.addAttribute("tablets", tabletsRepo.findAllByproducent(criterion));
        model.addAttribute("notebooks", notebooksRepo.findAllByproducent(criterion));
        return "list-tablets";
    }
}
