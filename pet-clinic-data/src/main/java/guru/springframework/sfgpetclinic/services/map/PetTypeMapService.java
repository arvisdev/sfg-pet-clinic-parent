/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author arvisdev
 */
@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService
{

    @Override
    public Set<PetType> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public PetType findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object)
    {
        // This is an override of the interface
        return super.save(object);
    }

    @Override
    public void delete(PetType object)
    {
        // This is an override of the abstract class
        super.delete(object);
    }

    @Override
    public void deleteById(Long id)
    {
        // This is an override of the abstract class
        super.deleteById(id);
    }
    
}
