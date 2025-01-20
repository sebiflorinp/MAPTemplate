package com.example.template.services;

import com.example.template.domain.Entity;
import com.example.template.domain.validators.Validator;
import com.example.template.repositories.Repository;

import java.util.Optional;

public abstract class Service<ID, E extends Entity<ID>> {
    private Repository<ID, E> repository;
    private Validator<E> validator;

    public Service(Repository<ID, E> repository, Validator<E> validator) {
        this.repository = repository;
        this.validator = validator;
    }
    
    public Optional<E> findById(ID id) {
        return repository.findById(id);
    }
    
    public Iterable<E> findAll() {
        return repository.findAll();
    }
    
    public Optional<E> save(E entity) {
        validator.validate(entity);
        return repository.save(entity);
    }
    
    public void deleteById(ID id) {
        repository.deleteById(id);
    }
    
    public Optional<E> update(E entity) {
        validator.validate(entity);
        return repository.update(entity);
    }
}
