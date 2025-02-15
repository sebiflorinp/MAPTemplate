package com.example.template.goodies.Paginare;

import com.example.template.domain.Entity;
import com.example.template.repositories.Repository;

import java.sql.SQLException;

public interface PagingRepository<ID, E extends Entity<ID>> extends Repository<ID, E> {
    Page<E> findAllOnPage(Pageable pageable) throws SQLException;
}