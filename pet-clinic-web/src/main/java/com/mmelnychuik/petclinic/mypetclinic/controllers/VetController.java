/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }

}
