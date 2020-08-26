/*
 * Created 2020., 8., 26.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.bootstrap;

import com.mmelnychuik.petclinic.mypetclinic.model.Owner;
import com.mmelnychuik.petclinic.mypetclinic.model.Vet;
import com.mmelnychuik.petclinic.mypetclinic.services.OwnerService;
import com.mmelnychuik.petclinic.mypetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        owner1.setFirstName("Sasha");
        owner1.setLastName("Mayer");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Maryna");
        owner2.setLastName("Melnychuk");
        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Bob");
        vet1.setLastName("Sat");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sam");
        vet2.setLastName("Golf");
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
