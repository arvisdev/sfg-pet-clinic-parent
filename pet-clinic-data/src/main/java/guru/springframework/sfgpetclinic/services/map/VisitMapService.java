package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService
{
    private final VisitService visitService;

    public VisitMapService(VisitService visitService)
    {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public Visit findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit)
    {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
                || visit.getPet().getOwner().getId() == null)
        {
            throw new RuntimeException("Invalid Visit");

            // This is an override of the interface
        } else
        {
            return super.save(visit);

        }
    }

    @Override
    public void delete(Visit object)
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
