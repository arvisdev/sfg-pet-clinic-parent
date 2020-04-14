/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Cleanup;

/**
 *
 * @author arvisdev
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity
{
    @Column(name = "date")
    private LocalDate date;
    
    @Column(name = "description")
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "pet_id")
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
