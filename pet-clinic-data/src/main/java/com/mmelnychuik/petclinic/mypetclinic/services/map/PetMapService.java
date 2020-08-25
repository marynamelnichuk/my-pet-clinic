/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services.map;

import com.mmelnychuik.petclinic.mypetclinic.model.Pet;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapServiceStandardImpl<Pet, Long> {

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }
}
