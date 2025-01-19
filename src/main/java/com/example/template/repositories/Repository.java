package com.example.template.repositories;

import com.example.template.domain.Entity;
import java.util.Optional;

public interface Repository <ID, E extends Entity<ID>> {
    Optional<E> findById(ID id);
    Iterable<E> findAll();
    Optional<E> save(E entity);
    void deleteById(ID id);
    Optional<E> update(E entity);
}
