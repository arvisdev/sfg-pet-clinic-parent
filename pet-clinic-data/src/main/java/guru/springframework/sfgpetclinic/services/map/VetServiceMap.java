package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudService;
import guru.springframework.sfgpetclinic.services.VetService;
import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService
{

    @Override
    public Set<Vet> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public Vet findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object)
    {
        // This is an override of the interface
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object)
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
