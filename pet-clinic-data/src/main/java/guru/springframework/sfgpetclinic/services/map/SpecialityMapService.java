/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import java.util.Set;
import org.springframework.stereotype.Service;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author arvisdev
 */
@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService
{

    @Override
    public Set<Speciality> findAll()
    {
        // This is an override of the abstract class
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id)
    {
        // This is an override of the abstract class
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object)
    {
        // This is an override of the interface
        return super.save(object);
    }

    @Override
    public void delete(Speciality object)
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
