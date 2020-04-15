/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author arvisdev
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity
{

    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    // Getters / Setters
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
