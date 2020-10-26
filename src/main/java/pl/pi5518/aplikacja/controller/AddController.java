package pl.pi5518.aplikacja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.pi5518.aplikacja.databases.Notebooks;
import pl.pi5518.aplikacja.repository.NotebooksRepo;

@Controller
public class AddController {
    private NotebooksRepo notebooksRepo;
//
//    @Autowired
//    public AddController(NotebooksRepo notebooksRepo) {
//        this.notebooksRepo = notebooksRepo;
//    }
//
//    @RequestMapping("/add-notebooks")
//    public String addNotebooks(
//            @RequestParam(required = false) String producent,
//            @RequestParam(required = false) String grupa_produktowa,
//            @RequestParam(required = false) String system_operacyjny,
//            @RequestParam(required = false) String rodzaj_laptopa,
//            @RequestParam(required = false) String przekatna_ekranu,
//            @RequestParam(required = false) String typ_procesora,
//            @RequestParam(required = false) String rodzaj_dysku,
//            @RequestParam(required = false) String rozdzielczosc,
//            @RequestParam(required = false) String seria_procesora,
//            @RequestParam(required = false) String model_procesora,
//            @RequestParam(required = false) String ilosc_rdzeni,
//            @RequestParam(required = false) String ilosc_dyskow,
//            @RequestParam(required = false) String pojemnosc_ssd,
//            @RequestParam(required = false) String pojemnosc_hdd,
//            @RequestParam(required = false) String karta_graficzna,
//            @RequestParam(required = false) String wyjscia_karty_graficznej,
//            @RequestParam(required = false) Double cena,
//            Model model) {
//        Notebooks notebooks = new Notebooks(producent, grupa_produktowa, system_operacyjny, rodzaj_laptopa,
//                przekatna_ekranu, typ_procesora, rodzaj_dysku, rozdzielczosc, seria_procesora, model_procesora,
//                ilosc_rdzeni, ilosc_dyskow, pojemnosc_ssd, pojemnosc_hdd, karta_graficzna, wyjscia_karty_graficznej,
//                cena, true);
//        System.out.println(notebooks);
//        if (notebooks.getProducent() != null)
//            notebooksRepo.save(notebooks);
//        model.addAttribute("notebooks", notebooks);
//        return "add-notebooks";
//    }
//
//    @RequestMapping("/list-notebooks")
//    public String list(Model model) {
//
//        for (Notebooks notebooks : notebooksRepo.findAll()) {
//            System.out.println(notebooks);
//        }
//        model.addAttribute("notebooks", notebooksRepo.findAll());
//        return "list-notebooks";
//    }
}