/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }

}
