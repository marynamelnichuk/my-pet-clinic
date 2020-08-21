/*
 * Created 2020., 8., 21.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services;

import com.mmelnychuik.petclinic.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
