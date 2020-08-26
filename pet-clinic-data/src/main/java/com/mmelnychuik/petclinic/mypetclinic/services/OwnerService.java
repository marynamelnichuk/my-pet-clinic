/*
 * Created 2020., 8., 21.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services;

import com.mmelnychuik.petclinic.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
