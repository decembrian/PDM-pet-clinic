package pdm.petclinic.poshadcmpetclinic.services;

import pdm.petclinic.poshadcmpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
