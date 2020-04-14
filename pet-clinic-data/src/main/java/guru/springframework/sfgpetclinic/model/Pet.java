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

/**
 *
 * @author arvisdev
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity
{

    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "type_id")
    @Column(name = "pet_type")
    private PetType petType;
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    @Column(name = "owner")
    private Owner owner;
    
    @Column(name = "birth_date")
    private LocalDate birthDate;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public PetType getPetType()
    {
        return petType;
    }

    public void setPetType(PetType petType)
    {
        this.petType = petType;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

}
