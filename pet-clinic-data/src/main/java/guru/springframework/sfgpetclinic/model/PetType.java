/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guru.springframework.sfgpetclinic.model;

/**
 *
 * @author arvisdev
 */
public class PetType extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    
}
