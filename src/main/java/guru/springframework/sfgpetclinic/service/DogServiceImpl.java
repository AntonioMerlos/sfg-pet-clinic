package guru.springframework.sfgpetclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dog")
@Service
public class DogServiceImpl implements PetService {

    @Override
    public String bestPet() {
        return "Dogs are the best";
    }
}
