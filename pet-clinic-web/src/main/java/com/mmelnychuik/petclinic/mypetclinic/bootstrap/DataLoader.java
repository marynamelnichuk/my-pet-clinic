/*
 * Created 2020., 8., 26.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.bootstrap;

import com.mmelnychuik.petclinic.mypetclinic.services.OwnerService;
import com.mmelnychuik.petclinic.mypetclinic.services.VetService;
import com.mmelnychuik.petclinic.mypetclinic.services.impl.OwnerServiceImpl;
import com.mmelnychuik.petclinic.mypetclinic.services.impl.VetServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceImpl();
        vetService = new VetServiceImpl();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
