package guru.springframework.sfgpetclinic;

import guru.springframework.sfgpetclinic.controller.PetController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgPetClinicApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");

        System.out.println(petController.declareBestPet());
    }
}
