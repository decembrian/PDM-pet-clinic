package pdm.petclinic.poshadcmpetclinic.services;

import pdm.petclinic.poshadcmpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
