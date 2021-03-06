package de.convinceit.belegmaschine.service;

import de.convinceit.belegmaschine.model.BasisBeleg;
import de.convinceit.belegmaschine.model.BasisBelegRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("klaraBasisService")
public class BasisBelegService<T extends BasisBeleg> {

    BasisBelegRepository basisBelegRepository;

    public BasisBelegService(BasisBelegRepository basisBelegRepository) {
        this.basisBelegRepository = basisBelegRepository;
    }

    @Transactional
    public BasisBeleg speichereBeleg(BasisBeleg beleg) {
        return basisBelegRepository.save(beleg);
    }


}
