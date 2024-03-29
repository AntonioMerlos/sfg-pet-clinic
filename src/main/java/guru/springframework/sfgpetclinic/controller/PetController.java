package guru.springframework.sfgpetclinic.controller;

import guru.springframework.sfgpetclinic.service.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String declareBestPet(){
        return petService.bestPet();
    }
}
