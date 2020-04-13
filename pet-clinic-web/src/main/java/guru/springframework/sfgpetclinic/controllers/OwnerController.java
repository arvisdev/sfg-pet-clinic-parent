package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author arvisdev
 */
@RequestMapping("/owners")
@Controller
public class OwnerController
{
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService)
    {
        this.ownerService = ownerService;
    }
    
    
    @RequestMapping({"" , "/", "/index", "/index.html"})
    public String listOwners(Model model)
    {
        model.addAttribute("owners", ownerService.findAll());
        
        Set<Owner> so = ownerService.findAll();
        for (Owner o : so)
        {
            System.out.println(o.getLastName() + ", " + o.getFirstName());
        }

        return "owners/index";
    }
    
    @RequestMapping("/find")
    public String findOwners()
    {
        return "notimplemented";
    }
    
}
