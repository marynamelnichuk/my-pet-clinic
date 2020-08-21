/*
 * Created 2020., 8., 21.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services;

import com.mmelnychuik.petclinic.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
