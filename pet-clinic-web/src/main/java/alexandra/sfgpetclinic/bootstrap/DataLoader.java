package alexandra.sfgpetclinic.bootstrap;

import alexandra.sfgpetclinic.model.Owner;
import alexandra.sfgpetclinic.model.Vet;
import alexandra.sfgpetclinic.services.OwnerService;
import alexandra.sfgpetclinic.services.VetService;
import alexandra.sfgpetclinic.services.map.OwnerServiceMap;
import alexandra.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Adrian");
        vet2.setLastName("Micu");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}