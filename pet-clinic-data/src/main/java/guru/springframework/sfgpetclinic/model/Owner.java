/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 *
 * @author arvisdev
 */
public class Owner extends Person
{
	private static final long serialVersionUID = 1L;
        
        private Set<Pet> pets;

    public Owner(Set<Pet> pets)
    {
        this.pets = pets;
    }
        
        
    
}
