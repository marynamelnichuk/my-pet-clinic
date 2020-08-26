/*
 * Created 2020., 8., 23.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services;

import java.util.Set;

public interface CrudService  <T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save (T object);

    void delete(T object);

    void deleteById(ID id);

}
