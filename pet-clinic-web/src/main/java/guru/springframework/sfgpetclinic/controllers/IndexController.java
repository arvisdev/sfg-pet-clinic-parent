/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arvisdev
 */
@Controller
public class IndexController
{

    @RequestMapping({"", "/", "index", "index.html"})
    public String index()
    {
        return "index";
    }

}
