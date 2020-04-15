/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author arvisdev
 */
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person
{
    private static final long serialVersionUID = 1L;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    @Column(name = "last_name")
    private Set<Pet> pets = new HashSet<>();

    public Owner(String address, String city, String telephone)
    {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    @Builder
    public Owner(String address, String city, String telephone, String firstName, String lastName)
    {
        super(firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }



    
}
