package pdm.petclinic.poshadcmpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pdm.petclinic.poshadcmpetclinic.model.Owner;
import pdm.petclinic.poshadcmpetclinic.model.Vet;
import pdm.petclinic.poshadcmpetclinic.services.OwnerService;
import pdm.petclinic.poshadcmpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Posh");
        owner1.setLastName("Zakharov");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Mike");
        owner2.setLastName("Vazovski");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jackie");
        vet1.setLastName("Choo");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Monney");
        vet2.setLastName("Dollar");

        vetService.save(vet2);

        System.out.println("Loaded vets....");
    }
}
