package com.example.template.services;

import com.example.template.domain.Entity;
import com.example.template.repositories.Repository;

import java.util.Optional;

public abstract class Service<ID, E extends Entity<ID>> {
    protected Repository<ID, E> repository;

    public Service(Repository<ID, E> repository) {
        this.repository = repository;
    }
    
    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }
    
    public Iterable<E> findAll() {
        return repository.findAll();
    }
    
    public Optional<E> save(E entity) {
        return repository.save(entity);
    }
    
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
    
    public Optional<E> update(E entity) {
        return repository.update(entity);
    }
}
