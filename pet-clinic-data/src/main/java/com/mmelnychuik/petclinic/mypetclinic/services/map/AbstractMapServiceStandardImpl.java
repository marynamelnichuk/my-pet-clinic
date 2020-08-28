/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.services.map;

import com.mmelnychuik.petclinic.mypetclinic.model.BaseEntity;
import com.mmelnychuik.petclinic.mypetclinic.services.CrudService;

import java.util.Set;

public abstract class AbstractMapServiceStandardImpl<T extends BaseEntity, ID extends Long>
        extends AbstractMapService<T, ID> implements CrudService<T, ID> {

    @Override
    public Set<T> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(ID id) {
        super.deleteById(id);
    }

    @Override
    public void delete(T object) {
        super.delete(object);
    }

    @Override
    public T findById(ID id) {
        return super.findById(id);
    }

    @Override
    public T save(T object) {
        return super.save(object);
    }
}
