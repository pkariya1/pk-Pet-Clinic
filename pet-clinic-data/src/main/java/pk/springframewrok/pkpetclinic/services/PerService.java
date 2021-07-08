package pk.springframewrok.pkpetclinic.services;


import pk.springframewrok.pkpetclinic.model.Pet;

import java.util.Set;

public interface PerService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();


}
