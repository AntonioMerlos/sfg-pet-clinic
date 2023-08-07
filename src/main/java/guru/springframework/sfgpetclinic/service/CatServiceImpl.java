package guru.springframework.sfgpetclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service
public class CatServiceImpl implements PetService {

    @Override
    public String bestPet() {
        return "Cats are the best";
    }
}
