/*
 * Created 2020., 8., 21.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
