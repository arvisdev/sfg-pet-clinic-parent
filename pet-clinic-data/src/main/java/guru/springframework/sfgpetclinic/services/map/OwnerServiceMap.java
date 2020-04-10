package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService
{

    @Override
    public Set<Owner> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public Owner findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object)
    {
        // This is an override of the interface
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object)
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
    
    @Override
    public Owner findByLastName(String lastName)
    {
        return null;
    }

}
