/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services.map;

import com.mmelnychuik.petclinic.mypetclinic.model.Vet;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapServiceStandardImpl<Vet, Long> {

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }

}
