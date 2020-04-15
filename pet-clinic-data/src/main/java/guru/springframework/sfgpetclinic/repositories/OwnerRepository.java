/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author arvisdev
 */
public interface OwnerRepository extends CrudRepository<Owner, Long>
{
    Owner findByLastName(String lastName);
}
