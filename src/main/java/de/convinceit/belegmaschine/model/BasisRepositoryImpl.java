package de.convinceit.belegmaschine.model;

import de.convinceit.belegmaschine.model.BasisRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BasisRepositoryImpl<T> implements BasisRepository<T> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void detachEntity(T entity) {
        entityManager.detach(entity);
    }

    public T findAndDetach(Class<T> entityClass, Object id) {
        T entity = entityManager.find(entityClass, id);
        entityManager.detach(entity);
        return entity;
    }

}
