package com.example.weblab3.DB;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.transaction.Transactional;

import java.util.List;

public abstract class AbstractDB<T> implements DB<T>  {
    @PersistenceContext
    EntityManager manager;

    private final Class<T> clazz;
    private List<T> hits;

    protected AbstractDB(Class<T> clazz){
        this.clazz = clazz;
    }

    @Override
    @Transactional
    public void clear() {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaDelete<T> delete = criteriaBuilder.createCriteriaDelete(clazz);
        delete.from(clazz);
        manager.createQuery(delete).executeUpdate();
    }

    @Override
    public List<T> getAll() {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
        CriteriaQuery<T> query = criteriaBuilder.createQuery(clazz);
        query.select(query.from(clazz));
        hits = manager.createQuery(query).getResultList();
        return hits;
    }

    @Override
    @Transactional
    public void add(T entity) {
        manager.persist(entity);
    }

    @Override
    public boolean isEmpty() {
        List<T> list = getAll();
        return list.isEmpty();
    }
}
