package pdm.petclinic.poshadcmpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pdm.petclinic.poshadcmpetclinic.services.VetService;

@Controller
public class VetController {

    private VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listOfVets(Model model){
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
