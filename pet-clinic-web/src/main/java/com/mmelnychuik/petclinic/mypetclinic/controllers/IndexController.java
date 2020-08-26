/*
 * Created 2020., 8., 24.
 * by mmelnychuk
 */

package com.mmelnychuik.petclinic.mypetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index(Model model){
        model.addAttribute("header", "Pet Clinic");
        return "index";
    }

}
