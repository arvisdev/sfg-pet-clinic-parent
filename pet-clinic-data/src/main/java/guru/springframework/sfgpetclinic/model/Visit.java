/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 *
 * @author arvisdev
 */
public class Visit extends BaseEntity
{
    private LocalDate date;
    private String description;
    private Pet Pet;

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Pet getPet()
    {
        return Pet;
    }

    public void setPet(Pet Pet)
    {
        this.Pet = Pet;
    }


    
}
