package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService
{
    
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService)
    {
        this.specialityService = specialityService;
    }
    

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
        if(object.getSpecialities().size() > 0) 
        {
            object.getSpecialities().forEach(speciality ->
            {
                if(speciality.getId() == null)
                {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        
        
        
        
        // This is an override of the interface
        return super.save(object);
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
