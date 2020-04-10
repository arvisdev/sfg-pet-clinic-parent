package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService
{

    @Override
    public Set<Pet> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public Pet findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object)
    {
        // This is an override of the interface
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object)
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
