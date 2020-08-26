/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services.map;

import com.mmelnychuik.petclinic.mypetclinic.model.Owner;
import com.mmelnychuik.petclinic.mypetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerMapService extends AbstractMapServiceStandardImpl<Owner, Long> implements OwnerService {

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
