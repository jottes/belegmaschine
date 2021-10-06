package de.convinceit.belegmaschine.model;

public interface BasisRepository<T> {

    void detachEntity(T entity);

    T findAndDetach(Class<T> entityClass, Object id);

}
