package de.convinceit.belegmaschine.model;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BasisBelegRepository extends CrudRepository<BasisBeleg, UUID> {
}
